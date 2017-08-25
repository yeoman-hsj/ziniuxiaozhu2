package com.ziniuxiaozhu.data.entity;

import java.util.Date;

/**
 * Created by yeoman on 2017/7/23.
 */
public class ResMedia extends ResBase {
    private Byte type;
    private Integer playCnt;
    private Integer downCnt;
    private Date gmtModify;

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getPlayCnt() {
        return playCnt;
    }

    public void setPlayCnt(Integer playCnt) {
        this.playCnt = playCnt;
    }

    public Integer getDownCnt() {
        return downCnt;
    }

    public void setDownCnt(Integer downCnt) {
        this.downCnt = downCnt;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    @Override
    public String toString() {
        return "ResMedia{" +
                "type=" + type +
                ", playCnt=" + playCnt +
                ", downCnt=" + downCnt +
                ", gmtModify=" + gmtModify +
                "} " + super.toString();
    }
}
