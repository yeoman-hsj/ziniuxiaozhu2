package com.ziniuxiaozhu.service.impl;

import com.ziniuxiaozhu.common.Const;
import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.data.mapper.CourseMapper;
import com.ziniuxiaozhu.service.interfaces.ICourseService;
import com.ziniuxiaozhu.service.interfaces.IResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by yeoman on 2017/7/18.
 */
@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private IResService resService;

    @Override
    public long add(Course course) {
        return courseMapper.insertOne(course);
    }

    @Override
    public Course getCourseById(Long id) {
        Course course = courseMapper.selectOneById(id);
        course.setCoverUrl(resService.getResCoverImgUrl(id));
        return course;
    }

    @Override
    public boolean update(Course course) {
        return courseMapper.update(course) == 1;
    }

    @Override
    public List<Course> getList() {
        List<Course> list = courseMapper.selectAll();
        for (Course course : list){
            course.setCoverUrl(resService.getResCoverImgUrl(course.getId()));
        }
        return list;
    }

    @Override
    public List<Course> getReviewList() {
        List<Course> list = courseMapper.selectListByStage(Const.CourseStage.REVIEW);
        for (Course course : list){
            course.setCoverUrl(resService.getResCoverImgUrl(course.getId()));
        }
        return list;
    }

}
