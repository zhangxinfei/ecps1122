package cn.itcast.model.params;

public class ShoppingParams {
    private Integer buyId;

    private Integer buyNumber;

    private String buyTotal;

    private Integer commodityId;

    private Integer userId;

    private Integer administratorsId;

    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
    }

    public Integer getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }

    public String getBuyTotal() {
        return buyTotal;
    }

    public void setBuyTotal(String buyTotal) {
        this.buyTotal = buyTotal == null ? null : buyTotal.trim();
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAdministratorsId() {
        return administratorsId;
    }

    public void setAdministratorsId(Integer administratorsId) {
        this.administratorsId = administratorsId;
    }
}