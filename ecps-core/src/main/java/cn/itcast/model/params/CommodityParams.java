package cn.itcast.model.params;

public class CommodityParams {
    private Integer commodityId;

    private String commodityName;

    private Long commodityPrice;

    private Integer commodityNumber;

    private String commodityPhone;

    private String commodityType;

    private String commodityDescribe;

    private Integer userId;

    private Integer administratorsid;

    private Integer commodityStatus;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Long getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Long commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public String getCommodityPhone() {
        return commodityPhone;
    }

    public void setCommodityPhone(String commodityPhone) {
        this.commodityPhone = commodityPhone == null ? null : commodityPhone.trim();
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType == null ? null : commodityType.trim();
    }

    public String getCommodityDescribe() {
        return commodityDescribe;
    }

    public void setCommodityDescribe(String commodityDescribe) {
        this.commodityDescribe = commodityDescribe == null ? null : commodityDescribe.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAdministratorsid() {
        return administratorsid;
    }

    public void setAdministratorsid(Integer administratorsid) {
        this.administratorsid = administratorsid;
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }
}