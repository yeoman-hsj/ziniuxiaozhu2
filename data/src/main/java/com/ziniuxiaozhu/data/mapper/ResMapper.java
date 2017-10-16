package com.ziniuxiaozhu.data.mapper;

import com.ziniuxiaozhu.data.entity.ResCover;
import com.ziniuxiaozhu.data.provider.ResCoverProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Created by yeoman on 2017/8/24.
 */
@Mapper
public interface ResMapper {

    @Select("select * from res_cover where relateId=#{relateId}")
    ResCover selectCoverOneById(Long relateId);

    @Insert({"INSERT INTO res_cover(id,relateId,name,suffix,size,host,dir,url,gmtCreate,extInt,extStr) " +
            "values(null,#{relateId},#{name},#{suffix},#{size},#{host},#{dir},#{url},NOW(),#{extInt},#{extStr})"})
    int insertCoverOne(ResCover obj);

    @UpdateProvider(type = ResCoverProvider.class, method = "updateByIdSelective")
    int updateCover(ResCover obj);

}
