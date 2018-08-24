package cn.itcast.model;

public class Administrators {
    private Integer administratorsId;

    private String administratorsName;

    private Integer administratorsNumber;

    private String administratorsNickname;

    private String administratorsIphone;

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

    public String getAdministratorsNickname() {
        return administratorsNickname;
    }

    public void setAdministratorsNickname(String administratorsNickname) {
        this.administratorsNickname = administratorsNickname == null ? null : administratorsNickname.trim();
    }

    public String getAdministratorsIphone() {
        return administratorsIphone;
    }

    public void setAdministratorsIphone(String administratorsIphone) {
        this.administratorsIphone = administratorsIphone == null ? null : administratorsIphone.trim();
    }
}