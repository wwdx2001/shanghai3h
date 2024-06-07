package com.example.dataprovider3.greendaoDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.dataprovider3.entity.RealNameWholeEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "REAL_NAME_WHOLE_ENTITY".
*/
public class RealNameWholeEntityDao extends AbstractDao<RealNameWholeEntity, Long> {

    public static final String TABLENAME = "REAL_NAME_WHOLE_ENTITY";

    /**
     * Properties of entity RealNameWholeEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, long.class, "ID", true, "_id");
        public final static Property S_CID = new Property(1, String.class, "S_CID", false, "S__CID");
        public final static Property UserType = new Property(2, String.class, "userType", false, "USER_TYPE");
        public final static Property ContactPerson = new Property(3, String.class, "contactPerson", false, "CONTACT_PERSON");
        public final static Property PhoneNum = new Property(4, String.class, "phoneNum", false, "PHONE_NUM");
        public final static Property Phone = new Property(5, String.class, "phone", false, "PHONE");
        public final static Property Email = new Property(6, String.class, "email", false, "EMAIL");
        public final static Property Remarks = new Property(7, String.class, "remarks", false, "REMARKS");
        public final static Property Images1 = new Property(8, String.class, "images1", false, "IMAGES1");
        public final static Property Images2 = new Property(9, String.class, "images2", false, "IMAGES2");
        public final static Property IsCommit = new Property(10, boolean.class, "isCommit", false, "IS_COMMIT");
        public final static Property UserTypePosition = new Property(11, Integer.class, "userTypePosition", false, "USER_TYPE_POSITION");
    }


    public RealNameWholeEntityDao(DaoConfig config) {
        super(config);
    }
    
    public RealNameWholeEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"REAL_NAME_WHOLE_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: ID
                "\"S__CID\" TEXT," + // 1: S_CID
                "\"USER_TYPE\" TEXT," + // 2: userType
                "\"CONTACT_PERSON\" TEXT," + // 3: contactPerson
                "\"PHONE_NUM\" TEXT," + // 4: phoneNum
                "\"PHONE\" TEXT," + // 5: phone
                "\"EMAIL\" TEXT," + // 6: email
                "\"REMARKS\" TEXT," + // 7: remarks
                "\"IMAGES1\" TEXT," + // 8: images1
                "\"IMAGES2\" TEXT," + // 9: images2
                "\"IS_COMMIT\" INTEGER NOT NULL ," + // 10: isCommit
                "\"USER_TYPE_POSITION\" INTEGER);"); // 11: userTypePosition
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"REAL_NAME_WHOLE_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, RealNameWholeEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getID());
 
        String S_CID = entity.getS_CID();
        if (S_CID != null) {
            stmt.bindString(2, S_CID);
        }
 
        String userType = entity.getUserType();
        if (userType != null) {
            stmt.bindString(3, userType);
        }
 
        String contactPerson = entity.getContactPerson();
        if (contactPerson != null) {
            stmt.bindString(4, contactPerson);
        }
 
        String phoneNum = entity.getPhoneNum();
        if (phoneNum != null) {
            stmt.bindString(5, phoneNum);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(6, phone);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(7, email);
        }
 
        String remarks = entity.getRemarks();
        if (remarks != null) {
            stmt.bindString(8, remarks);
        }
 
        String images1 = entity.getImages1();
        if (images1 != null) {
            stmt.bindString(9, images1);
        }
 
        String images2 = entity.getImages2();
        if (images2 != null) {
            stmt.bindString(10, images2);
        }
        stmt.bindLong(11, entity.getIsCommit() ? 1L: 0L);
 
        Integer userTypePosition = entity.getUserTypePosition();
        if (userTypePosition != null) {
            stmt.bindLong(12, userTypePosition);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, RealNameWholeEntity entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getID());
 
        String S_CID = entity.getS_CID();
        if (S_CID != null) {
            stmt.bindString(2, S_CID);
        }
 
        String userType = entity.getUserType();
        if (userType != null) {
            stmt.bindString(3, userType);
        }
 
        String contactPerson = entity.getContactPerson();
        if (contactPerson != null) {
            stmt.bindString(4, contactPerson);
        }
 
        String phoneNum = entity.getPhoneNum();
        if (phoneNum != null) {
            stmt.bindString(5, phoneNum);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(6, phone);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(7, email);
        }
 
        String remarks = entity.getRemarks();
        if (remarks != null) {
            stmt.bindString(8, remarks);
        }
 
        String images1 = entity.getImages1();
        if (images1 != null) {
            stmt.bindString(9, images1);
        }
 
        String images2 = entity.getImages2();
        if (images2 != null) {
            stmt.bindString(10, images2);
        }
        stmt.bindLong(11, entity.getIsCommit() ? 1L: 0L);
 
        Integer userTypePosition = entity.getUserTypePosition();
        if (userTypePosition != null) {
            stmt.bindLong(12, userTypePosition);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public RealNameWholeEntity readEntity(Cursor cursor, int offset) {
        RealNameWholeEntity entity = new RealNameWholeEntity( //
            cursor.getLong(offset + 0), // ID
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // S_CID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // userType
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // contactPerson
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // phoneNum
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // phone
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // email
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // remarks
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // images1
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // images2
            cursor.getShort(offset + 10) != 0, // isCommit
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11) // userTypePosition
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, RealNameWholeEntity entity, int offset) {
        entity.setID(cursor.getLong(offset + 0));
        entity.setS_CID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUserType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setContactPerson(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPhoneNum(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPhone(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setEmail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRemarks(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setImages1(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setImages2(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setIsCommit(cursor.getShort(offset + 10) != 0);
        entity.setUserTypePosition(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(RealNameWholeEntity entity, long rowId) {
        entity.setID(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(RealNameWholeEntity entity) {
        if(entity != null) {
            return entity.getID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(RealNameWholeEntity entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}