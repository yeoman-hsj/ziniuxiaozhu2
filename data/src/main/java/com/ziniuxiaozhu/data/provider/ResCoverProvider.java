package com.ziniuxiaozhu.data.provider;

import com.ziniuxiaozhu.data.entity.ResCover;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by yeoman on 2017/8/30.
 */
public class ResCoverProvider {

    public String updateByIdSelective(ResCover obj){
        return new SQL(){{
            UPDATE("res_cover");
            if(obj.getName() != null){
                SET("name = #{name}");
            }
            if(obj.getSuffix() != null){
                SET("suffix = #{suffix}");
            }
            if(obj.getSize() != null){
                SET("size = #{size}");
            }
            if(obj.getHost() != null){
                SET("host = #{host}");
            }
            if(obj.getDir() != null){
                SET("dir = #{dir}");
            }
            if(obj.getUrl() != null){
                SET("url = #{url}");
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
