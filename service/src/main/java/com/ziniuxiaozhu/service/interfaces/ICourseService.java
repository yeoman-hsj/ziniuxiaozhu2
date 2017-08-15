package com.ziniuxiaozhu.service.interfaces;

import com.ziniuxiaozhu.data.entity.Course;

/**
 * Created by yeoman on 2017/7/18.
 */
public interface ICourseService {

    long add(Course course);

    Course getCourseById(Long id);

    boolean update(Course course);
}
