package com.ziniuxiaozhu.http.form;

/** 课程详情表单
 * Created by yeoman on 2017/7/14.
 */
public class CourseForm {
    private Long id;
    private String title;
    private String descrip;
    private String audience;
    private Long gmtLecture;
    private String addr;
    private Integer quotaNum;
    private Integer excessNum;

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

    public boolean checkQuotaNum(){
        if (null == this.quotaNum || this.quotaNum < 0 || this.quotaNum > 9999){
            return false;
        }
        return true;
    }

    public boolean checkExcessNum(){
        if (null == this.excessNum || this.excessNum < 0 || this.excessNum > 9999){
            return false;
        }
        return true;
    }
}
