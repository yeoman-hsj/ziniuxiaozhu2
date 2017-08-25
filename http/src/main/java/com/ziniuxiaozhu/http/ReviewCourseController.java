package com.ziniuxiaozhu.http;

import com.ziniuxiaozhu.common.Const;
import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.http.form.CourseForm;
import com.ziniuxiaozhu.service.interfaces.ICourseService;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 审核课程接口
 * Created by yeoman on 2017/7/22.
 */
@RestController
public class ReviewCourseController extends BaseController {

    @Resource
    private ICourseService courseService;

    /**
     * 审核课程
     * @param form
     * @return
     */
    @PostMapping("/course/review")
    public ModelMap review(CourseForm form){
        if(!isAdmin()){
            return getFailResult(Const.ReturnCode.F_202, "无操作权限");
        }
        if (null != form) {
            Byte stage = form.getStage();
            if (form.getId() < 1 || StringUtils.isEmpty(stage)) {
                return getFailResult(Const.ReturnCode.F_201, "参数错误");
            }
            Course curObj = courseService.getCourseById(form.getId());
            if(null == curObj){
                return getFailResult(Const.ReturnCode.F_301, "未查到数据");
            }
            if(!curObj.getStage().equals(Const.CourseStage.REVIEW)){
                return getFailResult(Const.ReturnCode.F_203, "不支持该操作");
            }
            Course course = new Course();
            course.setId(form.getId());
            course.setStage(stage);
            //审核未通过
            if(stage.equals(Const.CourseStage.STAY)){

            //审核通过，并确定开讲时间和讲课地点
            }else if(stage.equals(Const.CourseStage.SIGNUP)
                    && null != form.getGmtLecture() && !StringUtils.isEmpty(form.getAddr())){
                course.setGmtLecture(new Date(form.getGmtLecture()));
                course.setAddr(form.getAddr());
            }else {
                return getFailResult(Const.ReturnCode.F_201, "参数错误");
            }
            System.out.println(course);
            if (courseService.update(course))
                return getSuccessResult();
            return getFailResult(Const.ReturnCode.F_303, "系统保存失败");
        }
        return getFailResult(Const.ReturnCode.F_201, "参数错误");
    }
}
