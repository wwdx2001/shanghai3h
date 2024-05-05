package com.sh3h.meterreading.ui.urge_search;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.StringUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.gc.materialdesign.views.SmoothProgressBar;
import com.sh3h.meterreading.R;
import com.sh3h.meterreading.ui.base.ParentActivity;
import com.sh3h.meterreading.util.Const;
import com.squareup.otto.Bus;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 实名制查询页面
 */
public class CallForPaymentSearchActivity extends ParentActivity {


//    @BindView(R.id.avl_toolbar)
//    Toolbar mToolbar;
    @BindView(R.id.et_user_number)
    EditText etUserNumber;
    @BindView(R.id.et_address)
    EditText etAddress;
    @BindView(R.id.tv_search_result)
    TextView mBtnSearch;
    @BindView(R.id.loading_process)
    SmoothProgressBar mSmoothProgressBar;

    @Inject
    Bus mEventBus;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_for_pay_search);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mEventBus.register(this);
//        mToolbar.setTitle("表卡查询");
//        setSupportActionBar(mToolbar);
        mSmoothProgressBar.setVisibility(View.INVISIBLE);
        setActionBarBackButtonEnable();
        setListener();
    }

    @Override
    protected void onRequestPermissionsResult(boolean isSuccess) {
        if (isSuccess) {
            initConfig();
        } else {
            finish();
        }
    }

    private void setListener() {
//        etUserNumber.setText("411002852");
//        etAddress.setText("渔乐路500弄凤凰花苑48号501室");
        mBtnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (StringUtils.isEmpty(etUserNumber.getText().toString().trim()) &&
                        StringUtils.isEmpty(etAddress.getText().toString().trim())) {
                    ToastUtils.showShort("请输入至少一个查询条件");
                    return;
                }
                //跳转过去查询
                Intent intent = new Intent(CallForPaymentSearchActivity.this, CallForPaymentSearchListActivity.class);
                intent.putExtra(Const.S_CID, etUserNumber.getText().toString());
                intent.putExtra(Const.S_DZ, etAddress.getText().toString());
                startActivity(intent);
            }
        });
    }




    @Override
    protected void onDestroy() {
        super.onDestroy();
        mEventBus.unregister(this);
    }

    @Override
    public void finish() {
        KeyboardUtils.hideSoftInput(this);
        super.finish();
    }
}