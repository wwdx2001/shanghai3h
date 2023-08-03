package com.sh3h.datautil.data.entity;


public class DURushPayTask implements IDUEntity {

    public static final int SHANGCHUANBZ_WEISHANGC = 0; // 未上传
    public static final int SHANGCHUANBZ_ZHENGZAISC = 1;  // 正在上传
    public static final int SHANGCHUANBZ_YISHANGC = 2;  // 已上传

    public static final int NOT_COMPLETE = 0; // 未完成
    public static final int COMPLETE = 1;  // 完成

    private long ID;
    private int I_TaskId;
    private String S_CardId;
    private String S_CardName;
    private String S_CardAddress;
    private String S_SubComCode;
    private double D_QfMonths;
    private double D_QfMoney;
    private int I_IsFinish;
    private String S_MeterReader;
    private String S_ReceiptRemark;
    private Long L_ReceiptTime;
    private String S_ReviewPerson;
    private Long L_UploadTime;
    private int I_IsUpload;
    private int I_ISComplete;

    private boolean isNewData;

    public DURushPayTask() {
    }

    public DURushPayTask(long ID) {
        this.ID = ID;
    }

    public DURushPayTask(long ID, int I_TaskId, String S_CardId, String S_CardName, String S_CardAddress, String S_SubComCode, double D_QfMonths, double D_QfMoney, int I_IsFinish, String S_MeterReader, String S_ReceiptRemark, Long L_ReceiptTime, String S_ReviewPerson, Long L_UploadTime, int I_IsUpload, int I_ISComplete) {
        this.ID = ID;
        this.I_TaskId = I_TaskId;
        this.S_CardId = S_CardId;
        this.S_CardName = S_CardName;
        this.S_CardAddress = S_CardAddress;
        this.S_SubComCode = S_SubComCode;
        this.D_QfMonths = D_QfMonths;
        this.D_QfMoney = D_QfMoney;
        this.I_IsFinish = I_IsFinish;
        this.S_MeterReader = S_MeterReader;
        this.S_ReceiptRemark = S_ReceiptRemark;
        this.L_ReceiptTime = L_ReceiptTime;
        this.S_ReviewPerson = S_ReviewPerson;
        this.L_UploadTime = L_UploadTime;
        this.I_IsUpload = I_IsUpload;
        this.I_ISComplete = I_ISComplete;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getI_TaskId() {
        return I_TaskId;
    }

    public void setI_TaskId(int I_TaskId) {
        this.I_TaskId = I_TaskId;
    }

    public String getS_CardId() {
        return S_CardId;
    }

    public void setS_CardId(String S_CardId) {
        this.S_CardId = S_CardId;
    }

    public String getS_CardName() {
        return S_CardName;
    }

    public void setS_CardName(String S_CardName) {
        this.S_CardName = S_CardName;
    }

    public String getS_CardAddress() {
        return S_CardAddress;
    }

    public void setS_CardAddress(String S_CardAddress) {
        this.S_CardAddress = S_CardAddress;
    }

    public String getS_SubComCode() {
        return S_SubComCode;
    }

    public void setS_SubComCode(String S_SubComCode) {
        this.S_SubComCode = S_SubComCode;
    }

    public double getD_QfMonths() {
        return D_QfMonths;
    }

    public void setD_QfMonths(double D_QfMonths) {
        this.D_QfMonths = D_QfMonths;
    }

    public double getD_QfMoney() {
        return D_QfMoney;
    }

    public void setD_QfMoney(double D_QfMoney) {
        this.D_QfMoney = D_QfMoney;
    }

    public int getI_IsFinish() {
        return I_IsFinish;
    }

    public void setI_IsFinish(int I_IsFinish) {
        this.I_IsFinish = I_IsFinish;
    }

    public String getS_MeterReader() {
        return S_MeterReader;
    }

    public void setS_MeterReader(String S_MeterReader) {
        this.S_MeterReader = S_MeterReader;
    }

    public String getS_ReceiptRemark() {
        return S_ReceiptRemark;
    }

    public void setS_ReceiptRemark(String S_ReceiptRemark) {
        this.S_ReceiptRemark = S_ReceiptRemark;
    }

    public Long getL_ReceiptTime() {
        return L_ReceiptTime;
    }

    public void setL_ReceiptTime(Long L_ReceiptTime) {
        this.L_ReceiptTime = L_ReceiptTime;
    }

    public String getS_ReviewPerson() {
        return S_ReviewPerson;
    }

    public void setS_ReviewPerson(String S_ReviewPerson) {
        this.S_ReviewPerson = S_ReviewPerson;
    }

    public Long getL_UploadTime() {
        return L_UploadTime;
    }

    public void setL_UploadTime(Long L_UploadTime) {
        this.L_UploadTime = L_UploadTime;
    }

    public int getI_IsUpload() {
        return I_IsUpload;
    }

    public void setI_IsUpload(int I_IsUpload) {
        this.I_IsUpload = I_IsUpload;
    }

    public int getI_ISComplete() {
        return I_ISComplete;
    }

    public void setI_ISComplete(int I_ISComplete) {
        this.I_ISComplete = I_ISComplete;
    }

    public boolean isNewData() {
        return isNewData;
    }

    public void setNewData(boolean newData) {
        isNewData = newData;
    }
}
