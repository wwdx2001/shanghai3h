package com.sh3h.meterreading.ui.InspectionInput.lr;

import com.sh3h.datautil.data.DataManager;
import com.sh3h.datautil.data.local.config.ConfigHelper;
import com.sh3h.datautil.data.local.preference.PreferencesHelper;
import com.sh3h.meterreading.ui.base.ParentPresenter;

import javax.inject.Inject;

public class WaiFuHistoryListPresenter extends ParentPresenter<WaiFuHistoryListPresenterMvpView> {
  private static final String TAG = "LROperatingPresenter";
  private final PreferencesHelper mPreferencesHelper;
  private final ConfigHelper mConfigHelper;

  @Inject
  public WaiFuHistoryListPresenter(DataManager dataManager, PreferencesHelper mPreferencesHelper, ConfigHelper mConfigHelper) {
    super(dataManager);
    this.mPreferencesHelper = mPreferencesHelper;
    this.mConfigHelper = mConfigHelper;

  }
}
