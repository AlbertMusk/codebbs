package com.codebbs.pojo;

import java.util.Date;

public class Reply {
    private Integer rId;

    private Integer rAid;

    private Integer rUid;

    private String rContent;

    private String rTitle;

    private Integer rLikeCount;

    private Date rCreateTime;

    public Reply(Integer rId, Integer rAid, Integer rUid, String rContent, String rTitle, Integer rLikeCount, Date rCreateTime) {
        this.rId = rId;
        this.rAid = rAid;
        this.rUid = rUid;
        this.rContent = rContent;
        this.rTitle = rTitle;
        this.rLikeCount = rLikeCount;
        this.rCreateTime = rCreateTime;
    }

    public Reply() {
        super();
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getrAid() {
        return rAid;
    }

    public void setrAid(Integer rAid) {
        this.rAid = rAid;
    }

    public Integer getrUid() {
        return rUid;
    }

    public void setrUid(Integer rUid) {
        this.rUid = rUid;
    }

    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent == null ? null : rContent.trim();
    }

    public String getrTitle() {
        return rTitle;
    }

    public void setrTitle(String rTitle) {
        this.rTitle = rTitle == null ? null : rTitle.trim();
    }

    public Integer getrLikeCount() {
        return rLikeCount;
    }

    public void setrLikeCount(Integer rLikeCount) {
        this.rLikeCount = rLikeCount;
    }

    public Date getrCreateTime() {
        return rCreateTime;
    }

    public void setrCreateTime(Date rCreateTime) {
        this.rCreateTime = rCreateTime;
    }
}