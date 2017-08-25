package com.ziniuxiaozhu.http.form;

/** 课程详情表单
 * Created by yeoman on 2017/7/14.
 */
public class CourseForm {
    private Long id;
    private String title;
    private String descrip;
    private String audience;
    private Long ruleId;
    private Byte stage;
    private Long gmtLecture;
    private String addr;

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

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Byte getStage() {
        return stage;
    }

    public void setStage(Byte stage) {
        this.stage = stage;
    }

    public Long getGmtLecture() {
        return gmtLecture;
    }

    public void setGmtLecture(Long gmtLecture) {
        this.gmtLecture = gmtLecture;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


    @Override
    public String toString() {
        return "CourseForm{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descrip='" + descrip + '\'' +
                ", audience='" + audience + '\'' +
                ", ruleId=" + ruleId +
                ", gmtLecture=" + gmtLecture +
                ", addr='" + addr + '\'' +
                '}';
    }
}
