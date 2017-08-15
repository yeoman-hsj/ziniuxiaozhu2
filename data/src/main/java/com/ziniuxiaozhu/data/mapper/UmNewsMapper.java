package com.ziniuxiaozhu.data.mapper;

import com.ziniuxiaozhu.data.entity.UmNews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yeoman on 2017/3/13.
 */
@Mapper
public interface UmNewsMapper {

    @Select("SELECT * FROM um_news WHERE id = #{id}")
    public UmNews selectNewsById(@Param("id") long id);
}
