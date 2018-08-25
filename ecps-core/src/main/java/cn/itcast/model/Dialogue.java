package cn.itcast.model;

import java.util.Date;

public class Dialogue {
    private Integer id;

    private Integer dialogueUser;

    private Integer dialogueFriend;

    private String dialogueType;

    private Date sendTime;

    private Date readTime;

    private Integer dialogueStatus;

    private String contentt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDialogueUser() {
        return dialogueUser;
    }

    public void setDialogueUser(Integer dialogueUser) {
        this.dialogueUser = dialogueUser;
    }

    public Integer getDialogueFriend() {
        return dialogueFriend;
    }

    public void setDialogueFriend(Integer dialogueFriend) {
        this.dialogueFriend = dialogueFriend;
    }

    public String getDialogueType() {
        return dialogueType;
    }

    public void setDialogueType(String dialogueType) {
        this.dialogueType = dialogueType == null ? null : dialogueType.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public Integer getDialogueStatus() {
        return dialogueStatus;
    }

    public void setDialogueStatus(Integer dialogueStatus) {
        this.dialogueStatus = dialogueStatus;
    }

    public String getContentt() {
        return contentt;
    }

    public void setContentt(String contentt) {
        this.contentt = contentt == null ? null : contentt.trim();
    }
}