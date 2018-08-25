package cn.itcast.model.params;

import java.util.Date;

public class AdministratorsParams {
    private Integer administratorsId;

    private String administratorsName;

    private Integer administratorsNumber;

    private String administratorsIphone;

    private Integer loginState;

    private Integer administratorsStatus;

    private Integer administratorsLevel;

    private String administratorsNickname;

    private Date createTime;

    private Date updateTime;

    public Integer getAdministratorsId() {
        return administratorsId;
    }

    public void setAdministratorsId(Integer administratorsId) {
        this.administratorsId = administratorsId;
    }

    public String getAdministratorsName() {
        return administratorsName;
    }

    public void setAdministratorsName(String administratorsName) {
        this.administratorsName = administratorsName == null ? null : administratorsName.trim();
    }

    public Integer getAdministratorsNumber() {
        return administratorsNumber;
    }

    public void setAdministratorsNumber(Integer administratorsNumber) {
        this.administratorsNumber = administratorsNumber;
    }

    public String getAdministratorsIphone() {
        return administratorsIphone;
    }

    public void setAdministratorsIphone(String administratorsIphone) {
        this.administratorsIphone = administratorsIphone == null ? null : administratorsIphone.trim();
    }

    public Integer getLoginState() {
        return loginState;
    }

    public void setLoginState(Integer loginState) {
        this.loginState = loginState;
    }

    public Integer getAdministratorsStatus() {
        return administratorsStatus;
    }

    public void setAdministratorsStatus(Integer administratorsStatus) {
        this.administratorsStatus = administratorsStatus;
    }

    public Integer getAdministratorsLevel() {
        return administratorsLevel;
    }

    public void setAdministratorsLevel(Integer administratorsLevel) {
        this.administratorsLevel = administratorsLevel;
    }

    public String getAdministratorsNickname() {
        return administratorsNickname;
    }

    public void setAdministratorsNickname(String administratorsNickname) {
        this.administratorsNickname = administratorsNickname == null ? null : administratorsNickname.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}