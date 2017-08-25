package com.ziniuxiaozhu.data.mapper;

import com.ziniuxiaozhu.data.entity.CourseSignup;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yeoman on 2017/8/24.
 */
@Mapper
public interface CourseSignupMapper {

    @Select("SELECT COUNT(1) FROM course_signup WHERE courseId=#{courseId} AND userId=#{userId} LIMIT 1")
    int selectCountByCidAndUid(@Param("courseId") Long courseId,@Param("userId") long userId);

    @Insert({"INSERT INTO course_signup(id,courseId,userId,gmtCreate,gmtModify,termId)" +
            "VALUES(NULL,#{courseId},#{userId},NOW(),NOW(),NULL)"})
    int insertOne(CourseSignup signup);
}
