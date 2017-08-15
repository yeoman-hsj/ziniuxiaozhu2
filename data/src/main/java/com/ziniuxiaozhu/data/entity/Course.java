package com.ziniuxiaozhu.data.entity;

import java.util.Date;

/**
 * Created by yeoman on 2017/7/14.
 */
public class Course {
    private Long id;
    private String title;
    private String descrip;
    private String audience;
    private Long lecturerId;
    private Date gmtCreate;
    private Date gmtLecture;
    private String addr;
    private Byte stage;
    private Integer quotaNum;
    private Integer excessNum;
    private String learnerIds;
    private Date gmtModify;
    private Integer extInt;
    private String extStr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public Long getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtLecture() {
        return gmtLecture;
    }

    public void setGmtLecture(Date gmtLecture) {
        this.gmtLecture = gmtLecture;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Byte getStage() {
        return stage;
    }

    public void setStage(Byte stage) {
        this.stage = stage;
    }

    public Integer getQuotaNum() {
        return quotaNum;
    }

    public void setQuotaNum(Integer quotaNum) {
        this.quotaNum = quotaNum;
    }

    public Integer getExcessNum() {
        return excessNum;
    }

    public void setExcessNum(Integer excessNum) {
        this.excessNum = excessNum;
    }

    public String getLearnerIds() {
        return learnerIds;
    }

    public void setLearnerIds(String learnerIds) {
        this.learnerIds = learnerIds;
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
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descrip='" + descrip + '\'' +
                ", audience='" + audience + '\'' +
                ", lecturerId=" + lecturerId +
                ", gmtCreate=" + gmtCreate +
                ", gmtLecture=" + gmtLecture +
                ", addr='" + addr + '\'' +
                ", stage=" + stage +
                ", quotaNum=" + quotaNum +
                ", excessNum=" + excessNum +
                ", learnerIds='" + learnerIds + '\'' +
                ", gmtModify=" + gmtModify +
                ", extInt=" + extInt +
                ", extStr='" + extStr + '\'' +
                '}';
    }
}
