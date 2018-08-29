package cn.itcast.model.params;

import cn.itcast.model.Order;

import java.util.Date;

public class OrderParams {
   private Order order;

    private Integer order_id;

    private Integer order_number;

    private String order_total;

    private Date createtime;

    private Integer administrators_id;

    private Integer commodity_id;

    private Integer buy_number;

    private Date updatetime;

    private String order_describe;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_number() {
        return order_number;
    }

    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    public String getOrder_total() {
        return order_total;
    }

    public void setOrder_total(String order_total) {
        this.order_total = order_total == null ? null : order_total.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getAdministrators_id() {
        return administrators_id;
    }

    public void setAdministrators_id(Integer administrators_id) {
        this.administrators_id = administrators_id;
    }

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public Integer getBuy_number() {
        return buy_number;
    }

    public void setBuy_number(Integer buy_number) {
        this.buy_number = buy_number;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getOrder_describe() {
        return order_describe;
    }

    public void setOrder_describe(String order_describe) {
        this.order_describe = order_describe == null ? null : order_describe.trim();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}