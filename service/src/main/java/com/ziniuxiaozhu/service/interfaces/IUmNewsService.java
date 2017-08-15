package com.ziniuxiaozhu.service.interfaces;


import com.ziniuxiaozhu.data.entity.UmNews;

/**
 * Created by yeoman on 2017/3/13.
 */
public interface IUmNewsService extends ITestService {

    @Override
    default UmNews getNews(long id){
        return null;
    }

    /**
     * 取出一条记录
     * @param id
     * @return
     */
    UmNews getOne(long id);
}