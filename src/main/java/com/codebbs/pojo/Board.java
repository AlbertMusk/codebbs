package com.codebbs.pojo;

import java.util.Date;

public class Board {
    private Integer bId;

    private String bName;

    private String bModertorId;

    private String bProfile;

    private String bStatement;

    private Integer bTopicCount;

    private Integer bClickCount;

    private Date bCreatTime;

    private Date bUpdateTime;

    public Board(Integer bId, String bName, String bModertorId, String bProfile, String bStatement, Integer bTopicCount, Integer bClickCount, Date bCreatTime, Date bUpdateTime) {
        this.bId = bId;
        this.bName = bName;
        this.bModertorId = bModertorId;
        this.bProfile = bProfile;
        this.bStatement = bStatement;
        this.bTopicCount = bTopicCount;
        this.bClickCount = bClickCount;
        this.bCreatTime = bCreatTime;
        this.bUpdateTime = bUpdateTime;
    }

    public Board() {
        super();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbModertorId() {
        return bModertorId;
    }

    public void setbModertorId(String bModertorId) {
        this.bModertorId = bModertorId == null ? null : bModertorId.trim();
    }

    public String getbProfile() {
        return bProfile;
    }

    public void setbProfile(String bProfile) {
        this.bProfile = bProfile == null ? null : bProfile.trim();
    }

    public String getbStatement() {
        return bStatement;
    }

    public void setbStatement(String bStatement) {
        this.bStatement = bStatement == null ? null : bStatement.trim();
    }

    public Integer getbTopicCount() {
        return bTopicCount;
    }

    public void setbTopicCount(Integer bTopicCount) {
        this.bTopicCount = bTopicCount;
    }

    public Integer getbClickCount() {
        return bClickCount;
    }

    public void setbClickCount(Integer bClickCount) {
        this.bClickCount = bClickCount;
    }

    public Date getbCreatTime() {
        return bCreatTime;
    }

    public void setbCreatTime(Date bCreatTime) {
        this.bCreatTime = bCreatTime;
    }

    public Date getbUpdateTime() {
        return bUpdateTime;
    }

    public void setbUpdateTime(Date bUpdateTime) {
        this.bUpdateTime = bUpdateTime;
    }
}