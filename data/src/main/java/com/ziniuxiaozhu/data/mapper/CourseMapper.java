package com.ziniuxiaozhu.data.mapper;

import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.data.provider.CourseProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by yeoman on 2017/7/18.
 */
@Mapper
public interface CourseMapper {

    @Insert("insert into course(id,title,descrip,audience,lecturerId,gmtCreate,gmtLecture,addr,stage," +
            "quotaNum,excessNum,learnerIds,gmtModify,extInt,extStr) values(null,#{title},#{descrip}," +
            "#{audience},#{lecturerId},now(),#{gmtLecture},#{addr},#{stage},#{quotaNum},#{excessNum}," +
            "#{learnerIds},now(),#{extInt},#{extStr})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    long insertOne(Course obj);

    @Select("select * from course where id=#{id}")
    Course selectOneById(Long id);

    @UpdateProvider(type = CourseProvider.class, method = "updateByIdSelective")
    int update(Course course);


}
