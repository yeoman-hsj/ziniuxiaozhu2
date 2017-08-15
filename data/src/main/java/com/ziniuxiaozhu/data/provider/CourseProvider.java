package com.ziniuxiaozhu.data.provider;

import com.ziniuxiaozhu.data.entity.Course;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by 明 on 2017/7/21.
 */
public class CourseProvider {

    public String updateByIdSelective(Course obj){
        System.out.println(123333);
        return new SQL(){{
            UPDATE("course");
            if(obj.getTitle() != null){
                SET("title = #{title}");
            }
            if(obj.getDescrip() != null){
                SET("descrip = #{descrip}");
            }
            if(obj.getAudience() != null){
                SET("audience = #{audience}");
            }
            if(obj.getGmtLecture() != null){
                SET("gmtLecture = #{gmtLecture}");
            }
            if(obj.getAddr() != null){
                SET("addr = #{addr}");
            }
            if(obj.getStage() != null){
                SET("stage = #{stage}");
            }
            if(obj.getQuotaNum() != null){
                SET("quotaNum = #{quotaNum}");
            }
            if(obj.getExcessNum() != null){
                SET("excessNum = #{excessNum}");
            }
            if(obj.getLearnerIds() != null){
                SET("learnerIds = #{learnerIds}");
            }
            if(obj.getGmtModify() != null){
                SET("gmtModify = now()");
            }
            if(obj.getExtInt() != null){
                SET("extInt = #{extInt}");
            }
            if(obj.getExtStr() != null){
                SET("extStr = #{extStr}");
            }
            WHERE("id = #{id}");
        }}.toString();
    }
}
