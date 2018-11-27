package com.codebbs.pojo;

import java.util.Date;

public class User {
    private Integer uId;

    private String uUsername;

    private String uName;

    private String uPassword;

    private String uEmail;

    private Integer uSex;

    private String uHead;

    private String uSatement;

    private Date uCreateTime;

    private Date uUpdateTime;

    private Integer uPoint;

    private Integer uIsModerator;

    public User(Integer uId, String uUsername, String uName, String uPassword, String uEmail, Integer uSex, String uHead, String uSatement, Date uCreateTime, Date uUpdateTime, Integer uPoint, Integer uIsModerator) {
        this.uId = uId;
        this.uUsername = uUsername;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uEmail = uEmail;
        this.uSex = uSex;
        this.uHead = uHead;
        this.uSatement = uSatement;
        this.uCreateTime = uCreateTime;
        this.uUpdateTime = uUpdateTime;
        this.uPoint = uPoint;
        this.uIsModerator = uIsModerator;
    }

    public User() {
        super();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public String getuHead() {
        return uHead;
    }

    public void setuHead(String uHead) {
        this.uHead = uHead == null ? null : uHead.trim();
    }

    public String getuSatement() {
        return uSatement;
    }

    public void setuSatement(String uSatement) {
        this.uSatement = uSatement == null ? null : uSatement.trim();
    }

    public Date getuCreateTime() {
        return uCreateTime;
    }

    public void setuCreateTime(Date uCreateTime) {
        this.uCreateTime = uCreateTime;
    }

    public Date getuUpdateTime() {
        return uUpdateTime;
    }

    public void setuUpdateTime(Date uUpdateTime) {
        this.uUpdateTime = uUpdateTime;
    }

    public Integer getuPoint() {
        return uPoint;
    }

    public void setuPoint(Integer uPoint) {
        this.uPoint = uPoint;
    }

    public Integer getuIsModerator() {
        return uIsModerator;
    }

    public void setuIsModerator(Integer uIsModerator) {
        this.uIsModerator = uIsModerator;
    }
}