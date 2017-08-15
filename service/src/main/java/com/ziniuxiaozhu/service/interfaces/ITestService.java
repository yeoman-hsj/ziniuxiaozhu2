package com.ziniuxiaozhu.service.interfaces;

import com.ziniuxiaozhu.data.entity.UmNews;

/**
 * Created by yeoman on 2017/7/14.
 */
public interface ITestService {

    /**
     * 取出一条记录
     * @param id
     * @return
     */
    UmNews getNews(long id);

    UmNews getOne(long id);

}
