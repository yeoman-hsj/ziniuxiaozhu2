package com.ziniuxiaozhu.data.mapper;

import com.ziniuxiaozhu.data.entity.ResCover;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yeoman on 2017/8/24.
 */
@Mapper
public interface ResMapper {

    @Select("select * from res_cover where relateId=#{relateId}")
    ResCover selectOneById(Long relateId);
}
