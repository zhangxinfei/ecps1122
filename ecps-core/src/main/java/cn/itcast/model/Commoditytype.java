package cn.itcast.model;

public class Commoditytype {
    private String commodityType;

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }
}