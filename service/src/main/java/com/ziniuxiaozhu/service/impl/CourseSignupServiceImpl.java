package com.ziniuxiaozhu.service.impl;

import com.ziniuxiaozhu.data.entity.CourseSignup;
import com.ziniuxiaozhu.data.mapper.CourseSignupMapper;
import com.ziniuxiaozhu.service.interfaces.ICourseSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yeoman on 2017/8/24.
 */
@Service
public class CourseSignupServiceImpl implements ICourseSignupService {

    @Autowired
    private CourseSignupMapper courseSignupMapper;

    @Override
    public boolean checkSignupByCidAndUid(Long courseId, long userId) {
        if(null == courseId || courseId < 1 || userId < 1) {
            return false;
        }
        int cnt =  courseSignupMapper.selectCountByCidAndUid(courseId, userId);
        return cnt > 0;
    }

    @Override
    public boolean add(CourseSignup signup) {
        return courseSignupMapper.insertOne(signup) == 1;
    }
}
