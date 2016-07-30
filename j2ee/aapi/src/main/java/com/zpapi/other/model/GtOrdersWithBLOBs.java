package com.zpapi.other.model;

public class GtOrdersWithBLOBs extends GtOrders {
    private String fillReduceRule;

    private String givePointRule;

    public String getFillReduceRule() {
        return fillReduceRule;
    }

    public void setFillReduceRule(String fillReduceRule) {
        this.fillReduceRule = fillReduceRule == null ? null : fillReduceRule.trim();
    }

    public String getGivePointRule() {
        return givePointRule;
    }

    public void setGivePointRule(String givePointRule) {
        this.givePointRule = givePointRule == null ? null : givePointRule.trim();
    }
}