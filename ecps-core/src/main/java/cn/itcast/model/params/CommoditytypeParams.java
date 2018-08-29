package cn.itcast.model.params;

import cn.itcast.model.Commoditytype;

public class CommoditytypeParams {
    private Commoditytype commoditytype;

    private Integer commodityType_id;

    private String commodity_type;

    private Integer commodity_status;

    private Integer administrators_id;

    public Integer getCommodityType_id() {
        return commodityType_id;
    }

    public void setCommodityType_id(Integer commodityType_id) {
        this.commodityType_id = commodityType_id;
    }

    public String getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(String commodity_type) {
        this.commodity_type = commodity_type == null ? null : commodity_type.trim();
    }

    public Integer getCommodity_status() {
        return commodity_status;
    }

    public void setCommodity_status(Integer commodity_status) {
        this.commodity_status = commodity_status;
    }

    public Integer getAdministrators_id() {
        return administrators_id;
    }

    public void setAdministrators_id(Integer administrators_id) {
        this.administrators_id = administrators_id;
    }


    public Commoditytype getCommoditytype() {
        return commoditytype;
    }

    public void setCommoditytype(Commoditytype commoditytype) {
        this.commoditytype = commoditytype;
    }
}