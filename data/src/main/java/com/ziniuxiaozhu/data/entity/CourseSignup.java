package com.ziniuxiaozhu.data.entity;

import java.util.Date;

/**
 * Created by yeoman on 2017/7/16.
 */
public class CourseSignup {
    private Long id;
    private Long courseId;
    private Long userId;
    private Integer rewardCnt;
    private Byte cmtFlag;
    private Date gmtCreate;
    private Date gmtModify;
    private Integer termId;
    private Integer extInt;
    private String extStr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRewardCnt() {
        return rewardCnt;
    }

    public void setRewardCnt(Integer rewardCnt) {
        this.rewardCnt = rewardCnt;
    }

    public Byte getCmtFlag() {
        return cmtFlag;
    }

    public void setCmtFlag(Byte cmtFlag) {
        this.cmtFlag = cmtFlag;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Integer getTermId() {
        return termId;
    }

    public void setTermId(Integer termId) {
        this.termId = termId;
    }

    public Integer getExtInt() {
        return extInt;
    }

    public void setExtInt(Integer extInt) {
        this.extInt = extInt;
    }

    public String getExtStr() {
        return extStr;
    }

    public void setExtStr(String extStr) {
        this.extStr = extStr;
    }

    @Override
    public String toString() {
        return "CourseSignup{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", userId=" + userId +
                ", rewardCnt=" + rewardCnt +
                ", cmtFlag=" + cmtFlag +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                ", termId=" + termId +
                ", extInt=" + extInt +
                ", extStr='" + extStr + '\'' +
                '}';
    }
}
