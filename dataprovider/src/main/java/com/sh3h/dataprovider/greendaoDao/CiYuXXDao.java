package com.sh3h.dataprovider.greendaoDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.QueryBuilder;

import com.sh3h.dataprovider.greendaoEntity.BIAOKAXX;
import com.sh3h.dataprovider.greendaoEntity.CiYuXX;

import java.util.ArrayList;
import java.util.List;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table CY_CiYuXX.
 */
public class CiYuXXDao extends AbstractDao<CiYuXX, Void> {

    public static final String TABLENAME = "CY_CiYuXX";

    /**
     * Properties of entity CiYuXX.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, int.class, "ID", false, "ID");
        public final static Property WORDSID = new Property(1, int.class, "WORDSID", false, "WORDSID");
        public final static Property WORDSCONTENT = new Property(2, String.class, "WORDSCONTENT", false, "WORDSCONTENT");
        public final static Property WORDSVALUE = new Property(3, String.class, "WORDSVALUE", false, "WORDSVALUE");
        public final static Property WORDSREMARK = new Property(4, String.class, "WORDSREMARK", false, "WORDSREMARK");
        public final static Property BELONGID = new Property(5, int.class, "BELONGID", false, "BELONGID");
        public final static Property SORTID = new Property(6, int.class, "SORTID", false, "SORTID");
        public final static Property ISACTIVE = new Property(7, int.class, "ISACTIVE", false, "ISACTIVE");
    }

    ;


    public CiYuXXDao(DaoConfig config) {
        super(config);
    }

    public CiYuXXDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'CY_CiYuXX' (" + //
                "'ID' INTEGER NOT NULL ," + // 0: ID
                "'WORDSID' INTEGER NOT NULL ," + // 1: WORDSID
                "'WORDSCONTENT' TEXT NOT NULL ," + // 2: WORDSCONTENT
                "'WORDSVALUE' TEXT NOT NULL ," + // 3: WORDSVALUE
                "'WORDSREMARK' TEXT," + // 4: WORDSREMARK
                "'BELONGID' INTEGER NOT NULL ," + // 5: BELONGID
                "'SORTID' INTEGER NOT NULL ," + // 6: SORTID
                "'ISACTIVE' INTEGER NOT NULL );"); // 7: ISACTIVE
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CY_CiYuXX'";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, CiYuXX entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getID());
        stmt.bindLong(2, entity.getWORDSID());
        stmt.bindString(3, entity.getWORDSCONTENT());
        stmt.bindString(4, entity.getWORDSVALUE());

        String WORDSREMARK = entity.getWORDSREMARK();
        if (WORDSREMARK != null) {
            stmt.bindString(5, WORDSREMARK);
        }
        stmt.bindLong(6, entity.getBELONGID());
        stmt.bindLong(7, entity.getSORTID());
        stmt.bindLong(8, entity.getISACTIVE());
    }

    /**
     * @inheritdoc
     */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }

    /**
     * @inheritdoc
     */
    @Override
    public CiYuXX readEntity(Cursor cursor, int offset) {
        CiYuXX entity = new CiYuXX( //
                cursor.getInt(offset + 0), // ID
                cursor.getInt(offset + 1), // WORDSID
                cursor.getString(offset + 2), // WORDSCONTENT
                cursor.getString(offset + 3), // WORDSVALUE
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // WORDSREMARK
                cursor.getInt(offset + 5), // BELONGID
                cursor.getInt(offset + 6), // SORTID
                cursor.getInt(offset + 7) // ISACTIVE
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, CiYuXX entity, int offset) {
        entity.setID(cursor.getInt(offset + 0));
        entity.setWORDSID(cursor.getInt(offset + 1));
        entity.setWORDSCONTENT(cursor.getString(offset + 2));
        entity.setWORDSVALUE(cursor.getString(offset + 3));
        entity.setWORDSREMARK(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBELONGID(cursor.getInt(offset + 5));
        entity.setSORTID(cursor.getInt(offset + 6));
        entity.setISACTIVE(cursor.getInt(offset + 7));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Void updateKeyAfterInsert(CiYuXX entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Void getKey(CiYuXX entity) {
        return null;
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }


    /**
     * 根据BelongID
     *
     * @param belongid
     * @return
     */
    public List<CiYuXX> getCiYuXX(int belongid) {

        QueryBuilder qb = this.queryBuilder();
        qb.where(Properties.BELONGID.eq(belongid));
        List<CiYuXX> ciYuXXes = qb.list();
        if (ciYuXXes == null || ciYuXXes.size() < 0) {
            return null;
        }
        return ciYuXXes;
    }

    /**
     * 判断文件中的code与数据库中code是否相同
     *
     * @param code 文件code
     * @return boolean
     */
    public boolean existCiYuXX(int code) {

        QueryBuilder qb = this.queryBuilder();
        qb.where(Properties.ID.eq(String.valueOf(code)));
        List<CiYuXX> ciYuXXes = qb.list();
        if (ciYuXXes.size() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除词语
     *
     * @return boolean
     */
    public boolean delete() {
        this.deleteAll();
        //this.queryBuilder().buildDelete().executeDeleteWithoutDetachingEntities();
        return true;
    }

    /**
     * 删除词语表中相对应的codeid数据
     *
     * @param code 数据id
     * @return boolean
     */
    public boolean delete(String code) {

        if (code == null) {
            return false;
        }

        QueryBuilder qb = this.queryBuilder();
        qb.where(Properties.WORDSID.eq(code)).buildDelete().executeDeleteWithoutDetachingEntities();
        return true;

    }


    /**
     * 向词语信息表插入新的数据
     *
     * @param ciyuXX 实体
     * @return boolean
     */
    public void insertCiyuXX(CiYuXX ciyuXX) {

        insertOrReplace(ciyuXX);

    }

    /**
     * 获取量高原因
     *
     * @return
     */
    public List<CiYuXX> getLiangGaoYY() {

        QueryBuilder qb = this.queryBuilder();
        qb.where(Properties.BELONGID.eq(999), Properties.WORDSVALUE.gt(0));
        List<CiYuXX> ciYuXXes = qb.list();
        if (ciYuXXes == null || ciYuXXes.size() < 0) {
            return null;
        }
        return ciYuXXes;
    }

    /**
     * 获取量低原因
     *
     * @return
     */
    public List<CiYuXX> getLiangDiYY() {

        QueryBuilder qb = this.queryBuilder();
        qb.where(Properties.BELONGID.eq(999), Properties.WORDSVALUE.lt(0));
        List<CiYuXX> ciYuXXes = qb.list();
        if (ciYuXXes == null || ciYuXXes.size() < 0) {
            return null;
        }
        return ciYuXXes;


    }

    /**
     * 获取未抄原因
     * @return
     */
    public List<CiYuXX> getNoReadReason(){
        QueryBuilder qb=this.queryBuilder();
        qb.whereOr(Properties.BELONGID.eq(888),Properties.BELONGID.eq(-888));
        List<CiYuXX> ciYuXXes = qb.list();
        if (ciYuXXes == null || ciYuXXes.size() < 0) {
            return null;
        }
        return ciYuXXes;
    }
}
