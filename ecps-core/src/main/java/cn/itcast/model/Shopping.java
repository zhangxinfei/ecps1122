package cn.itcast.model;

public class Shopping {
    private Integer buy_id;

    private Integer buy_number;

    private String buy_total;

    private Integer commodity_id;

    private Integer user_id;

    private Integer administrators_id;

    public Integer getBuy_id() {
        return buy_id;
    }

    public void setBuy_id(Integer buy_id) {
        this.buy_id = buy_id;
    }

    public Integer getBuy_number() {
        return buy_number;
    }

    public void setBuy_number(Integer buy_number) {
        this.buy_number = buy_number;
    }

    public String getBuy_total() {
        return buy_total;
    }

    public void setBuy_total(String buy_total) {
        this.buy_total = buy_total == null ? null : buy_total.trim();
    }

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getAdministrators_id() {
        return administrators_id;
    }

    public void setAdministrators_id(Integer administrators_id) {
        this.administrators_id = administrators_id;
    }
}