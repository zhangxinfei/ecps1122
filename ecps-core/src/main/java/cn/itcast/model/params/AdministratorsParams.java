package cn.itcast.model.params;

import cn.itcast.model.Administrators;

import java.util.Date;

public class AdministratorsParams {
    private Administrators administrators;

    private Integer administrators_id;

    private String administrators_name;

    private Integer administrators_number;

    private String administrators_iphone;

    private Integer login_state;

    private Integer administrators_status;

    private Integer administrators_level;

    private String administrators_nickname;

    private Date create_time;

    private Date update_time;

    public Integer getAdministrators_id() {
        return administrators_id;
    }

    public void setAdministrators_id(Integer administrators_id) {
        this.administrators_id = administrators_id;
    }

    public String getAdministrators_name() {
        return administrators_name;
    }

    public void setAdministrators_name(String administrators_name) {
        this.administrators_name = administrators_name == null ? null : administrators_name.trim();
    }

    public Integer getAdministrators_number() {
        return administrators_number;
    }

    public void setAdministrators_number(Integer administrators_number) {
        this.administrators_number = administrators_number;
    }

    public String getAdministrators_iphone() {
        return administrators_iphone;
    }

    public void setAdministrators_iphone(String administrators_iphone) {
        this.administrators_iphone = administrators_iphone == null ? null : administrators_iphone.trim();
    }

    public Integer getLogin_state() {
        return login_state;
    }

    public void setLogin_state(Integer login_state) {
        this.login_state = login_state;
    }

    public Integer getAdministrators_status() {
        return administrators_status;
    }

    public void setAdministrators_status(Integer administrators_status) {
        this.administrators_status = administrators_status;
    }

    public Integer getAdministrators_level() {
        return administrators_level;
    }

    public void setAdministrators_level(Integer administrators_level) {
        this.administrators_level = administrators_level;
    }

    public String getAdministrators_nickname() {
        return administrators_nickname;
    }

    public void setAdministrators_nickname(String administrators_nickname) {
        this.administrators_nickname = administrators_nickname == null ? null : administrators_nickname.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }


    public Administrators getAdministrators() {
        return administrators;
    }

    public void setAdministrators(Administrators administrators) {
        this.administrators = administrators;
    }
}