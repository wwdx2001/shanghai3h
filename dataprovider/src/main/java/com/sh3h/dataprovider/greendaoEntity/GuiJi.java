package com.sh3h.dataprovider.greendaoEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CB_GuiJi.
 */
public class GuiJi {

    private int ID;
    /** Not-null value. */
    private String S_CH;
    private Integer I_CENEIXH;
    private String S_X;
    private String S_Y;

    public GuiJi() {
    }

    public GuiJi(int ID, String S_CH, Integer I_CENEIXH, String S_X, String S_Y) {
        this.ID = ID;
        this.S_CH = S_CH;
        this.I_CENEIXH = I_CENEIXH;
        this.S_X = S_X;
        this.S_Y = S_Y;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    /** Not-null value. */
    public String getS_CH() {
        return S_CH;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setS_CH(String S_CH) {
        this.S_CH = S_CH;
    }

    public Integer getI_CENEIXH() {
        return I_CENEIXH;
    }

    public void setI_CENEIXH(Integer I_CENEIXH) {
        this.I_CENEIXH = I_CENEIXH;
    }

    public String getS_X() {
        return S_X;
    }

    public void setS_X(String S_X) {
        this.S_X = S_X;
    }

    public String getS_Y() {
        return S_Y;
    }

    public void setS_Y(String S_Y) {
        this.S_Y = S_Y;
    }

}
