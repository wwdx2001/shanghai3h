package com.sh3h.meterreading.ui.usage_change.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.example.dataprovider3.entity.UsageChangeInfoPriceEntity;
import com.example.dataprovider3.entity.UsageChangeUploadWholeEntity;
import com.sh3h.meterreading.R;
import com.sh3h.meterreading.adapter.FullyLinearLayoutManager;
import com.sh3h.meterreading.ui.base.ParentFragment;
import com.sh3h.meterreading.ui.custom_view.SelectSpinnerView;
import com.sh3h.meterreading.ui.usage_change.adapter.UsageChangePriceAdapter;
import com.sh3h.meterreading.ui.usage_change.contract.UsageChangeInfoContract;
import com.sh3h.meterreading.ui.usage_change.presenter.UsageChangeInfoPresenterImpl;
import com.sh3h.meterreading.util.Const;
import com.sh3h.mobileutil.util.TextUtil;

import java.util.List;

/**
 * 用水性质变更
 */
public class UsageChangeInfoFragment extends ParentFragment implements UsageChangeInfoContract.View {
    private SelectSpinnerView mUsageChangeUploadJhSpinner;
    private SelectSpinnerView mUsageChangeUploadCodeSpinner;
    private EditText mUsageChangeUploadRemarksEt;
    private RecyclerView mRecyclerView;

    private UsageChangePriceAdapter mAdapter;
    private UsageChangeInfoPresenterImpl mPresenter;

    private List<String> mJianHaoList;
    private int mJhPosition;
    private int mSsdmPosition;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_usage_change_upload;
    }

    @Override
    protected void initView1(View view) {
        super.initView1(view);
        mUsageChangeUploadJhSpinner = view.findViewById(R.id.usage_change_upload_jh_spinner);
        mUsageChangeUploadCodeSpinner = view.findViewById(R.id.usage_change_upload_code_spinner);
        mUsageChangeUploadRemarksEt = view.findViewById(R.id.usage_change_upload_remarks_et);
        mRecyclerView = view.findViewById(R.id.recycler_view);
    }

    @Override
    protected void initData1() {
        super.initData1();
        mPresenter = new UsageChangeInfoPresenterImpl(this);

        Bundle bundle = getArguments();
        if (bundle != null) {
            List<String> codeStrings = (List<String>) bundle.getSerializable(Const.STRINGS);
            mJianHaoList = (List<String>) bundle.getSerializable(Const.JIANHAOS);
            UsageChangeUploadWholeEntity entity = (UsageChangeUploadWholeEntity) bundle.getParcelable(Const.BEAN);

            if (codeStrings != null && codeStrings.size() > 0) {
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, codeStrings);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mUsageChangeUploadCodeSpinner.setAdapter(adapter);
                mUsageChangeUploadCodeSpinner.setSelection(entity != null ? entity.getSsdmPosition() : 0);
            }

            if (mJianHaoList != null && mJianHaoList.size() > 0) {
                ArrayAdapter<String> jianhaoAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, mJianHaoList);
                jianhaoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mUsageChangeUploadJhSpinner.setAdapter(jianhaoAdapter);
                mUsageChangeUploadJhSpinner.setSelection(entity != null ? entity.getJhPosition() : 0);
            }

            mUsageChangeUploadRemarksEt.setText(entity != null ? entity.getRemarks() : "");
        }
    }

    @Override
    protected void initListener1() {
        super.initListener1();
        mUsageChangeUploadJhSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mJhPosition = position;
                mPresenter.getPriceChagnesData(mJianHaoList.get(position).split("-")[0]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
//        mUsageChangeUploadJhSpinner.setItemClick(new SelectSpinnerView.SpinnerItemClick() {
//            @Override
//            public void onSpinnerItemClick(int position) {
//                mJhPosition = position;
//            }
//        });

        mUsageChangeUploadCodeSpinner.setItemClick(new SelectSpinnerView.SpinnerItemClick() {
            @Override
            public void onSpinnerItemClick(int position) {
                mSsdmPosition = position;
            }
        });
    }

    @Override
    protected void lazyLoad() {

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private Activity currentActivity;

    @Override
    public void onAttach(Context context) {
        currentActivity = getActivity() == null ? ActivityUtils.getTopActivity() : getActivity();
        super.onAttach(context);
    }

    public UsageChangeUploadWholeEntity getFillBack() {
        String code = (String) mUsageChangeUploadCodeSpinner.getSelectedItem();
        String jh = (String) mUsageChangeUploadJhSpinner.getSelectedItem();

        if (TextUtil.isNullOrEmpty(code)
                || TextUtil.isNullOrEmpty(jh)) {
            ToastUtils.showLong("请填写必要信息");
            return null;
        }
        String remarks = mUsageChangeUploadRemarksEt.getText().toString();

        UsageChangeUploadWholeEntity entity = new UsageChangeUploadWholeEntity();
        entity.setJhPosition(mJhPosition);
        entity.setSsdmPosition(mSsdmPosition);
        entity.setJh(jh.split("-")[0]);
        entity.setSsdm(code.split("-")[0]);
        entity.setRemarks(TextUtil.isNullOrEmpty(remarks) ? "" : remarks);

        return entity;
    }

    @Override
    public void success(Object o) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                List<UsageChangeInfoPriceEntity> data = (List<UsageChangeInfoPriceEntity>) o;

                if (data != null && data.size() > 0) {
                    mAdapter = new UsageChangePriceAdapter(data);
                    mRecyclerView.setHasFixedSize(true);
                    mRecyclerView.setLayoutManager(new FullyLinearLayoutManager(getActivity()));
                    mRecyclerView.setAdapter(mAdapter);
                }
            }
        });

    }

    @Override
    public void failed(String result) {
        ToastUtils.showLong(result);
    }

    @Override
    public void error(String s) {

    }
}