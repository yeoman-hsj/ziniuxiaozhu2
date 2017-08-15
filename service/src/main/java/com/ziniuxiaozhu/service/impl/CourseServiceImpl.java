package com.ziniuxiaozhu.service.impl;

import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.data.mapper.CourseMapper;
import com.ziniuxiaozhu.service.interfaces.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yeoman on 2017/7/18.
 */
@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public long add(Course course) {
        return courseMapper.insertOne(course);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseMapper.selectOneById(id);
    }

    @Override
    public boolean update(Course course) {
        return courseMapper.update(course) == 1;
    }
}
