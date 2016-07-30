package com.zpapi.other.model;

public class GtMemberProfileWithBLOBs extends GtMemberProfile {
    private String hobby;

    private String addScoreLog;

    private String lastOrderPayment;

    private String lastOrderInvoiceInfo;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getAddScoreLog() {
        return addScoreLog;
    }

    public void setAddScoreLog(String addScoreLog) {
        this.addScoreLog = addScoreLog == null ? null : addScoreLog.trim();
    }

    public String getLastOrderPayment() {
        return lastOrderPayment;
    }

    public void setLastOrderPayment(String lastOrderPayment) {
        this.lastOrderPayment = lastOrderPayment == null ? null : lastOrderPayment.trim();
    }

    public String getLastOrderInvoiceInfo() {
        return lastOrderInvoiceInfo;
    }

    public void setLastOrderInvoiceInfo(String lastOrderInvoiceInfo) {
        this.lastOrderInvoiceInfo = lastOrderInvoiceInfo == null ? null : lastOrderInvoiceInfo.trim();
    }
}