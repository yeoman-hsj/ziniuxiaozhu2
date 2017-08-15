package com.ziniuxiaozhu.service.impl;

import com.ziniuxiaozhu.data.entity.UmNews;
import com.ziniuxiaozhu.data.mapper.UmNewsMapper;
import com.ziniuxiaozhu.service.interfaces.IUmNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yeoman on 2017/3/13.
 */
@Service
public class UmNewsSrvImpl implements IUmNewsService {

    @Autowired
    private UmNewsMapper umNewsMapper;

    @Override
    public UmNews getOne(long id) {
        return umNewsMapper.selectNewsById(id);
    }
}
