package cn.itcast.model.params;

public class CommoditytypeParams {
    private Integer commoditytypeId;

    private String commodityType;

    private Integer commodityStatus;

    private Integer administratorsId;

    public Integer getCommoditytypeId() {
        return commoditytypeId;
    }

    public void setCommoditytypeId(Integer commoditytypeId) {
        this.commoditytypeId = commoditytypeId;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public Integer getAdministratorsId() {
        return administratorsId;
    }

    public void setAdministratorsId(Integer administratorsId) {
        this.administratorsId = administratorsId;
    }
}