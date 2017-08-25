package com.ziniuxiaozhu.data.entity;

import java.util.Date;

/**
 * Created by yeoman on 2017/7/14.
 */
public class Course {
    private Long id;
    private String title;
    private String descrip;
    private Long lecturerId;
    private String lecturerName;
    private String audience;
    private Date gmtLecture;
    private String addr;
    private Byte stage;
    private Long ruleId;
    private Integer signupNum;
    private Date gmtCreate;
    private Date gmtModify;
    private Integer extInt;
    private String extStr;
    private String coverUrl;
    private String pptUrl;
    private String speechUrl;
    private String audioUrl;
    private String videoUrl;

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

    public Long getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
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

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getSignupNum() {
        return signupNum;
    }

    public void setSignupNum(Integer signupNum) {
        this.signupNum = signupNum;
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

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getPptUrl() {
        return pptUrl;
    }

    public void setPptUrl(String pptUrl) {
        this.pptUrl = pptUrl;
    }

    public String getSpeechUrl() {
        return speechUrl;
    }

    public void setSpeechUrl(String speechUrl) {
        this.speechUrl = speechUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descrip='" + descrip + '\'' +
                ", lecturerId=" + lecturerId +
                ", lecturerName='" + lecturerName + '\'' +
                ", audience='" + audience + '\'' +
                ", gmtLecture=" + gmtLecture +
                ", addr='" + addr + '\'' +
                ", stage=" + stage +
                ", ruleId=" + ruleId +
                ", signupNum=" + signupNum +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                ", extInt=" + extInt +
                ", extStr='" + extStr + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", pptUrl='" + pptUrl + '\'' +
                ", speechUrl='" + speechUrl + '\'' +
                ", audioUrl='" + audioUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }
}
