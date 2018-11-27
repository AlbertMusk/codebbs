package com.codebbs.pojo;

import java.util.Date;

public class Article {
    private Integer aId;

    private Integer aSid;

    private Integer aUid;

    private String aTitle;

    private String aSummary;

    private Integer aClickCount;

    private Integer aReplyCount;

    private String aContent;

    private Integer aFlag;

    private Integer aKid;

    private Date aCreateTime;

    private Date aUpdateTime;

    public Article(Integer aId, Integer aSid, Integer aUid, String aTitle, String aSummary, Integer aClickCount, Integer aReplyCount, String aContent, Integer aFlag, Integer aKid, Date aCreateTime, Date aUpdateTime) {
        this.aId = aId;
        this.aSid = aSid;
        this.aUid = aUid;
        this.aTitle = aTitle;
        this.aSummary = aSummary;
        this.aClickCount = aClickCount;
        this.aReplyCount = aReplyCount;
        this.aContent = aContent;
        this.aFlag = aFlag;
        this.aKid = aKid;
        this.aCreateTime = aCreateTime;
        this.aUpdateTime = aUpdateTime;
    }

    public Article() {
        super();
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getaSid() {
        return aSid;
    }

    public void setaSid(Integer aSid) {
        this.aSid = aSid;
    }

    public Integer getaUid() {
        return aUid;
    }

    public void setaUid(Integer aUid) {
        this.aUid = aUid;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle == null ? null : aTitle.trim();
    }

    public String getaSummary() {
        return aSummary;
    }

    public void setaSummary(String aSummary) {
        this.aSummary = aSummary == null ? null : aSummary.trim();
    }

    public Integer getaClickCount() {
        return aClickCount;
    }

    public void setaClickCount(Integer aClickCount) {
        this.aClickCount = aClickCount;
    }

    public Integer getaReplyCount() {
        return aReplyCount;
    }

    public void setaReplyCount(Integer aReplyCount) {
        this.aReplyCount = aReplyCount;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent == null ? null : aContent.trim();
    }

    public Integer getaFlag() {
        return aFlag;
    }

    public void setaFlag(Integer aFlag) {
        this.aFlag = aFlag;
    }

    public Integer getaKid() {
        return aKid;
    }

    public void setaKid(Integer aKid) {
        this.aKid = aKid;
    }

    public Date getaCreateTime() {
        return aCreateTime;
    }

    public void setaCreateTime(Date aCreateTime) {
        this.aCreateTime = aCreateTime;
    }

    public Date getaUpdateTime() {
        return aUpdateTime;
    }

    public void setaUpdateTime(Date aUpdateTime) {
        this.aUpdateTime = aUpdateTime;
    }
}