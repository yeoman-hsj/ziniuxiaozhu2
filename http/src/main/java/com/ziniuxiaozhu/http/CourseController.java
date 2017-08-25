package com.ziniuxiaozhu.http;

import com.ziniuxiaozhu.common.Const;
import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.http.form.CourseForm;
import com.ziniuxiaozhu.service.interfaces.ICourseService;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 课程管理相关接口
 * Created by yeoman on 2017/7/14.
 */
@RestController
@RequestMapping("/course")
public class CourseController extends BaseController{

    @Resource
    private ICourseService courseService;

    /**
     * 获取课程列表
     * @return
     */
    @GetMapping("/getList")
    @ResponseBody
    public ModelMap getList(){
        return getSuccessResult(courseService.getList());
    }

    /**
     * 获取课程详情
     * @param id
     * @return
     */
    @GetMapping("/getCourseInfo")
    @ResponseBody
    public ModelMap getCourseInfo(Long id){
        if(null != id && id > 0){
            Course course = courseService.getCourseById(id);
            if(null != course){
                return getSuccessResult(course);
            }
            return getFailResult(Const.ReturnCode.F_301,"未查到课程信息");
        }
        return getFailResult(Const.ReturnCode.F_201,"参数错误");
    }

    /**
     * 发布课程
     * @param form
     * @return
     */
    @PostMapping("/publish")
    @ResponseBody
    public ModelMap publish(CourseForm form){
        if (null != form){
            if (StringUtils.isEmpty(form.getTitle()) || StringUtils.isEmpty(form.getDescrip())
                    || StringUtils.isEmpty(form.getAudience())){
                return getFailResult(Const.ReturnCode.F_201, "参数错误");
            }
            Course course = new Course();
            course.setTitle(form.getTitle());
            course.setDescrip(form.getDescrip());
            course.setLecturerId(getUserId());
            course.setLecturerName(getUserName());
            course.setAudience(form.getAudience());
            course.setRuleId(Const.CourseRule.PUBLISH_INIT);
            course.setStage(Const.CourseStage.PUBLISH);
            System.out.println(course);
            courseService.add(course);
            return getSuccessResult();
        }
        return getFailResult(Const.ReturnCode.F_201);
    }

    /**
     * 更新课程
     * @param form
     * @return
     */
    @PostMapping("/update")
    @ResponseBody
    public ModelMap update(CourseForm form) {
        if (null != form) {
            if (form.getId() < 1 || StringUtils.isEmpty(form.getTitle())
                    || StringUtils.isEmpty(form.getDescrip())
                    || StringUtils.isEmpty(form.getAudience())) {
                return getFailResult(Const.ReturnCode.F_201, "参数错误");
            }
            Course course = new Course();
            course.setId(form.getId());
            course.setTitle(form.getTitle());
            course.setDescrip(form.getDescrip());
            course.setAudience(form.getAudience());
            course.setRuleId(Const.CourseRule.PUBLISH_INIT);
            System.out.println(course);
            if (courseService.update(course))
                return getSuccessResult();
            return getFailResult(Const.ReturnCode.F_303, "系统保存失败");
        }
        return getFailResult(Const.ReturnCode.F_201);
    }

}
