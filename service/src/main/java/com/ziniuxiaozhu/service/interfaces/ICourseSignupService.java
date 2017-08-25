package com.ziniuxiaozhu.service.interfaces;

import com.ziniuxiaozhu.data.entity.CourseSignup;
/**
 * 课程报名服务
 * Created by yeoman on 2017/8/24.
 */
public interface ICourseSignupService {

    /**
     * 检查某用户是否报名了某课程
     * @param courseId
     * @param userId
     * @return
     */
    boolean checkSignupByCidAndUid(Long courseId, long userId);

    /**
     * 创建报名信息
     * @param signup
     * @return
     */
    boolean add(CourseSignup signup);
}
