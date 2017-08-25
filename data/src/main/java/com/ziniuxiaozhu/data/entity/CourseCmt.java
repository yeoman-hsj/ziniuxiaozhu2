package com.ziniuxiaozhu.data.entity;

import java.util.Date;

/**
 * Created by yeoman on 2017/7/18.
 */
public class CourseCmt {
    private Long id;
    private Long courseId;
    private Long userId;
    private Long parentId;
    private Integer likeCnt;
    private String content;
    private Date gmtCreate;
    private Date gmtModify;
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLikeCnt() {
        return likeCnt;
    }

    public void setLikeCnt(Integer likeCnt) {
        this.likeCnt = likeCnt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "CourseCmt{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", userId=" + userId +
                ", parentId=" + parentId +
                ", likeCnt=" + likeCnt +
                ", content='" + content + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                ", extInt=" + extInt +
                ", extStr='" + extStr + '\'' +
                '}';
    }
}
