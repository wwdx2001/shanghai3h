package com.example.dataprovider3.greendaoDao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.dataprovider3.entity.CallForPaymentArrearsFeesDetailBean;
import com.example.dataprovider3.entity.CallForPaymentBackFillDataBean;
import com.example.dataprovider3.entity.CallForPaymentTaskBean;
import com.example.dataprovider3.entity.CuijiaoEntity;
import com.example.dataprovider3.entity.RealNameWholeEntity;
import com.example.dataprovider3.entity.ShimingzhiEntity;
import com.example.dataprovider3.entity.UsageChangeUploadWholeEntity;

import com.example.dataprovider3.greendaoDao.CallForPaymentArrearsFeesDetailBeanDao;
import com.example.dataprovider3.greendaoDao.CallForPaymentBackFillDataBeanDao;
import com.example.dataprovider3.greendaoDao.CallForPaymentTaskBeanDao;
import com.example.dataprovider3.greendaoDao.CuijiaoEntityDao;
import com.example.dataprovider3.greendaoDao.RealNameWholeEntityDao;
import com.example.dataprovider3.greendaoDao.ShimingzhiEntityDao;
import com.example.dataprovider3.greendaoDao.UsageChangeUploadWholeEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig callForPaymentArrearsFeesDetailBeanDaoConfig;
    private final DaoConfig callForPaymentBackFillDataBeanDaoConfig;
    private final DaoConfig callForPaymentTaskBeanDaoConfig;
    private final DaoConfig cuijiaoEntityDaoConfig;
    private final DaoConfig realNameWholeEntityDaoConfig;
    private final DaoConfig shimingzhiEntityDaoConfig;
    private final DaoConfig usageChangeUploadWholeEntityDaoConfig;

    private final CallForPaymentArrearsFeesDetailBeanDao callForPaymentArrearsFeesDetailBeanDao;
    private final CallForPaymentBackFillDataBeanDao callForPaymentBackFillDataBeanDao;
    private final CallForPaymentTaskBeanDao callForPaymentTaskBeanDao;
    private final CuijiaoEntityDao cuijiaoEntityDao;
    private final RealNameWholeEntityDao realNameWholeEntityDao;
    private final ShimingzhiEntityDao shimingzhiEntityDao;
    private final UsageChangeUploadWholeEntityDao usageChangeUploadWholeEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        callForPaymentArrearsFeesDetailBeanDaoConfig = daoConfigMap.get(CallForPaymentArrearsFeesDetailBeanDao.class).clone();
        callForPaymentArrearsFeesDetailBeanDaoConfig.initIdentityScope(type);

        callForPaymentBackFillDataBeanDaoConfig = daoConfigMap.get(CallForPaymentBackFillDataBeanDao.class).clone();
        callForPaymentBackFillDataBeanDaoConfig.initIdentityScope(type);

        callForPaymentTaskBeanDaoConfig = daoConfigMap.get(CallForPaymentTaskBeanDao.class).clone();
        callForPaymentTaskBeanDaoConfig.initIdentityScope(type);

        cuijiaoEntityDaoConfig = daoConfigMap.get(CuijiaoEntityDao.class).clone();
        cuijiaoEntityDaoConfig.initIdentityScope(type);

        realNameWholeEntityDaoConfig = daoConfigMap.get(RealNameWholeEntityDao.class).clone();
        realNameWholeEntityDaoConfig.initIdentityScope(type);

        shimingzhiEntityDaoConfig = daoConfigMap.get(ShimingzhiEntityDao.class).clone();
        shimingzhiEntityDaoConfig.initIdentityScope(type);

        usageChangeUploadWholeEntityDaoConfig = daoConfigMap.get(UsageChangeUploadWholeEntityDao.class).clone();
        usageChangeUploadWholeEntityDaoConfig.initIdentityScope(type);

        callForPaymentArrearsFeesDetailBeanDao = new CallForPaymentArrearsFeesDetailBeanDao(callForPaymentArrearsFeesDetailBeanDaoConfig, this);
        callForPaymentBackFillDataBeanDao = new CallForPaymentBackFillDataBeanDao(callForPaymentBackFillDataBeanDaoConfig, this);
        callForPaymentTaskBeanDao = new CallForPaymentTaskBeanDao(callForPaymentTaskBeanDaoConfig, this);
        cuijiaoEntityDao = new CuijiaoEntityDao(cuijiaoEntityDaoConfig, this);
        realNameWholeEntityDao = new RealNameWholeEntityDao(realNameWholeEntityDaoConfig, this);
        shimingzhiEntityDao = new ShimingzhiEntityDao(shimingzhiEntityDaoConfig, this);
        usageChangeUploadWholeEntityDao = new UsageChangeUploadWholeEntityDao(usageChangeUploadWholeEntityDaoConfig, this);

        registerDao(CallForPaymentArrearsFeesDetailBean.class, callForPaymentArrearsFeesDetailBeanDao);
        registerDao(CallForPaymentBackFillDataBean.class, callForPaymentBackFillDataBeanDao);
        registerDao(CallForPaymentTaskBean.class, callForPaymentTaskBeanDao);
        registerDao(CuijiaoEntity.class, cuijiaoEntityDao);
        registerDao(RealNameWholeEntity.class, realNameWholeEntityDao);
        registerDao(ShimingzhiEntity.class, shimingzhiEntityDao);
        registerDao(UsageChangeUploadWholeEntity.class, usageChangeUploadWholeEntityDao);
    }
    
    public void clear() {
        callForPaymentArrearsFeesDetailBeanDaoConfig.clearIdentityScope();
        callForPaymentBackFillDataBeanDaoConfig.clearIdentityScope();
        callForPaymentTaskBeanDaoConfig.clearIdentityScope();
        cuijiaoEntityDaoConfig.clearIdentityScope();
        realNameWholeEntityDaoConfig.clearIdentityScope();
        shimingzhiEntityDaoConfig.clearIdentityScope();
        usageChangeUploadWholeEntityDaoConfig.clearIdentityScope();
    }

    public CallForPaymentArrearsFeesDetailBeanDao getCallForPaymentArrearsFeesDetailBeanDao() {
        return callForPaymentArrearsFeesDetailBeanDao;
    }

    public CallForPaymentBackFillDataBeanDao getCallForPaymentBackFillDataBeanDao() {
        return callForPaymentBackFillDataBeanDao;
    }

    public CallForPaymentTaskBeanDao getCallForPaymentTaskBeanDao() {
        return callForPaymentTaskBeanDao;
    }

    public CuijiaoEntityDao getCuijiaoEntityDao() {
        return cuijiaoEntityDao;
    }

    public RealNameWholeEntityDao getRealNameWholeEntityDao() {
        return realNameWholeEntityDao;
    }

    public ShimingzhiEntityDao getShimingzhiEntityDao() {
        return shimingzhiEntityDao;
    }

    public UsageChangeUploadWholeEntityDao getUsageChangeUploadWholeEntityDao() {
        return usageChangeUploadWholeEntityDao;
    }

}
