package com.ziniuxiaozhu.data.entity;

import java.util.Date;

/**
 * Created by yeoman on 2017/3/13.
 */
public class UmNews {
    private long id;
    private String title;
    private byte type;
    private String synopsis;
    private String synoImg;
    private String content;
    private byte publish;
    private Date gmtCreate;
    private Date gmtModify;
    private String options;

    public UmNews() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getSynoImg() {
        return synoImg;
    }

    public void setSynoImg(String synoImg) {
        this.synoImg = synoImg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte getPublish() {
        return publish;
    }

    public void setPublish(byte publish) {
        this.publish = publish;
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

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "UmNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", synopsis='" + synopsis + '\'' +
                ", synoImg='" + synoImg + '\'' +
                ", content='" + content + '\'' +
                ", publish=" + publish +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                ", options='" + options + '\'' +
                '}';
    }
}
