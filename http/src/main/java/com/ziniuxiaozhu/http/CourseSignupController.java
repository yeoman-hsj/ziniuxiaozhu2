package com.ziniuxiaozhu.http;

import com.ziniuxiaozhu.common.Const;
import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.data.entity.CourseSignup;
import com.ziniuxiaozhu.service.interfaces.ICourseService;
import com.ziniuxiaozhu.service.interfaces.ICourseSignupService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 课程报名接口
 * Created by yeoman on 2017/7/21.
 */
@RestController
public class CourseSignupController extends BaseController {

    @Resource
    private ICourseService courseService;
    @Resource
    private ICourseSignupService courseSignupService;

    /**
     * 报名课程
     * @param cid
     * @return
     */
    @GetMapping("/course/signup")
    public ModelMap signup(Long cid){
        if(null == cid || cid < 1){
            return getFailResult(Const.ReturnCode.F_201,"参数错误");
        }
        Course course = courseService.getCourseById(cid);
        if(null == course){
            return getFailResult(Const.ReturnCode.F_201,"参数错误");
        }
        if(course.getStage().equals(Const.CourseStage.SIGNUP)){
            if(courseSignupService.checkSignupByCidAndUid(cid, getUserId())){
                return getFailResult(Const.ReturnCode.F_204, "无需重复操作");
            }
            CourseSignup signup = new CourseSignup();
            signup.setCourseId(cid);
            signup.setUserId(getUserId());
            if(courseSignupService.add(signup)){
                return getSuccessResult();
            }
            return getFailResult(Const.ReturnCode.F_303, "系统保存失败");
        }
        return getFailResult(Const.ReturnCode.F_203,"不支持该操作");
    }
}
