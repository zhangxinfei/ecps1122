package cn.itcast.model;

public class Commodity {
    private Integer commodity_id;

    private String commodity_name;

    private Long commodity_price;

    private Integer commodity_number;

    private String commodity_phone;

    private String commodity_type;

    private String commodity_describe;

    private Integer user_id;

    private Integer administratorsId;

    private Integer commodity_status;

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name == null ? null : commodity_name.trim();
    }

    public Long getCommodity_price() {
        return commodity_price;
    }

    public void setCommodity_price(Long commodity_price) {
        this.commodity_price = commodity_price;
    }

    public Integer getCommodity_number() {
        return commodity_number;
    }

    public void setCommodity_number(Integer commodity_number) {
        this.commodity_number = commodity_number;
    }

    public String getCommodity_phone() {
        return commodity_phone;
    }

    public void setCommodity_phone(String commodity_phone) {
        this.commodity_phone = commodity_phone == null ? null : commodity_phone.trim();
    }

    public String getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(String commodity_type) {
        this.commodity_type = commodity_type == null ? null : commodity_type.trim();
    }

    public String getCommodity_describe() {
        return commodity_describe;
    }

    public void setCommodity_describe(String commodity_describe) {
        this.commodity_describe = commodity_describe == null ? null : commodity_describe.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getAdministratorsId() {
        return administratorsId;
    }

    public void setAdministratorsId(Integer administratorsId) {
        this.administratorsId = administratorsId;
    }

    public Integer getCommodity_status() {
    return commodity_status;
}

    public void setCommodity_status(Integer commodity_status) {
        this.commodity_status = commodity_status;
    }
}