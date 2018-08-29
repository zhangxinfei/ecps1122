package cn.itcast.model;

import java.util.Date;

public class User {
    private Integer user_id;

    private String user_name;

    private String password;

    private Integer user_iphone;

    private Integer user_qq;

    private String user_sex;

    private Date user_birthday;

    private String user_adress;

    private String user_school;

    private String user_studentId;

    private String user_classid;

    private Integer user_credit;

    private Integer user_status;

    private Integer login_state;

    private String user_username;

    private Date create_time;

    private Date update_time;

    private Integer administrators_id;

    private Integer user_role;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUser_iphone() {
        return user_iphone;
    }

    public void setUser_iphone(Integer user_iphone) {
        this.user_iphone = user_iphone;
    }

    public Integer getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(Integer user_qq) {
        this.user_qq = user_qq;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex == null ? null : user_sex.trim();
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_adress() {
        return user_adress;
    }

    public void setUser_adress(String user_adress) {
        this.user_adress = user_adress == null ? null : user_adress.trim();
    }

    public String getUser_school() {
        return user_school;
    }

    public void setUser_school(String user_school) {
        this.user_school = user_school == null ? null : user_school.trim();
    }

    public String getUser_studentId() {
        return user_studentId;
    }

    public void setUser_studentId(String user_studentId) {
        this.user_studentId = user_studentId == null ? null : user_studentId.trim();
    }

    public String getUser_classid() {
        return user_classid;
    }

    public void setUser_classid(String user_classid) {
        this.user_classid = user_classid == null ? null : user_classid.trim();
    }

    public Integer getUser_credit() {
        return user_credit;
    }

    public void setUser_credit(Integer user_credit) {
        this.user_credit = user_credit;
    }

    public Integer getUser_status() {
        return user_status;
    }

    public void setUser_status(Integer user_status) {
        this.user_status = user_status;
    }

    public Integer getLogin_state() {
        return login_state;
    }

    public void setLogin_state(Integer login_state) {
        this.login_state = login_state;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username == null ? null : user_username.trim();
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

    public Integer getAdministrators_id() {
        return administrators_id;
    }

    public void setAdministrators_id(Integer administrators_id) {
        this.administrators_id = administrators_id;
    }

    public Integer getUser_role() {
        return user_role;
    }

    public void setUser_role(Integer user_role) {
        this.user_role = user_role;
    }
}