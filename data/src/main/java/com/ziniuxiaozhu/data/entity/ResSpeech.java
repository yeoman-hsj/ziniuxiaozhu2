package com.ziniuxiaozhu.data.entity;

/**
 * Created by yeoman on 2017/7/23.
 */
public class ResSpeech extends ResBase {
    private Integer downCnt;

    public Integer getDownCnt() {
        return downCnt;
    }

    public void setDownCnt(Integer downCnt) {
        this.downCnt = downCnt;
    }

    @Override
    public String toString() {
        return "ResPPT{" +
                "downCnt=" + downCnt +
                "} " + super.toString();
    }
}
