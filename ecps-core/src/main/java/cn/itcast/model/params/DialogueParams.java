package cn.itcast.model.params;

import cn.itcast.model.Dialogue;

import java.util.Date;

public class DialogueParams {
    private Dialogue dialogue;

    private Integer id;

    private Integer dialogue_user;

    private Integer dialogue_friend;

    private String dialogue_type;

    private Date send_time;

    private Date read_time;

    private Integer dialogue_status;

    private String contentt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDialogue_user() {
        return dialogue_user;
    }

    public void setDialogue_user(Integer dialogue_user) {
        this.dialogue_user = dialogue_user;
    }

    public Integer getDialogue_friend() {
        return dialogue_friend;
    }

    public void setDialogue_friend(Integer dialogue_friend) {
        this.dialogue_friend = dialogue_friend;
    }

    public String getDialogue_type() {
        return dialogue_type;
    }

    public void setDialogue_type(String dialogue_type) {
        this.dialogue_type = dialogue_type == null ? null : dialogue_type.trim();
    }

    public Date getSend_time() {
        return send_time;
    }

    public void setSend_time(Date send_time) {
        this.send_time = send_time;
    }

    public Date getRead_time() {
        return read_time;
    }

    public void setRead_time(Date read_time) {
        this.read_time = read_time;
    }

    public Integer getDialogue_status() {
        return dialogue_status;
    }

    public void setDialogue_status(Integer dialogue_status) {
        this.dialogue_status = dialogue_status;
    }

    public String getContentt() {
        return contentt;
    }

    public void setContentt(String contentt) {
        this.contentt = contentt == null ? null : contentt.trim();
    }


    public Dialogue getDialogue() {
        return dialogue;
    }

    public void setDialogue(Dialogue dialogue) {
        this.dialogue = dialogue;
    }
}