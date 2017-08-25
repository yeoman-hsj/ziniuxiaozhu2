package com.ziniuxiaozhu.data.entity;

import java.util.Date;

/**
 * Created by yeoman on 2017/7/16.
 */
public class ResBase {
    private Long id;
    private Long relateId;
    private String name;
    private String suffix;
    private Integer size;
    private String host;
    private String dir;
    private String url;
    private Date gmtCreate;
    private Integer extInt;
    private String extStr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelateId() {
        return relateId;
    }

    public void setRelateId(Long relateId) {
        this.relateId = relateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
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
        return "ResBase{" +
                "id=" + id +
                ", relateId=" + relateId +
                ", name='" + name + '\'' +
                ", suffix='" + suffix + '\'' +
                ", size=" + size +
                ", host='" + host + '\'' +
                ", dir='" + dir + '\'' +
                ", url='" + url + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", extInt=" + extInt +
                ", extStr='" + extStr + '\'' +
                '}';
    }
}
