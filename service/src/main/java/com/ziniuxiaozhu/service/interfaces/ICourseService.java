package com.ziniuxiaozhu.service.interfaces;

import com.ziniuxiaozhu.data.entity.Course;

import java.util.List;

/**
 * 课程管理服务
 * Created by yeoman on 2017/7/18.
 */
public interface ICourseService {

    /**
     * 创建课程信息
     * @param course
     * @return
     */
    long add(Course course);

    /**
     * 获取课程信息
     * @param id 课程ID
     * @return
     */
    Course getCourseById(Long id);

    /**
     * 更新课程信息
     * @param course
     * @return
     */
    boolean update(Course course);

    /**
     * 获取课程信息列表
     * @return
     */
    List<Course> getList();

    /**
     * 获取待审核课程列表
     * @return
     */
    List<Course> getReviewList();
}
