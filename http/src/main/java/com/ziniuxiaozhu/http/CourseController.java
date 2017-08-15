package com.ziniuxiaozhu.http;

import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.http.form.CourseForm;
import com.ziniuxiaozhu.service.interfaces.ICourseService;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yeoman on 2017/7/14.
 */
@RestController
@RequestMapping("/course")
public class CourseController extends BaseController{

    @Resource
    private ICourseService courseService;

    @GetMapping("/getCourseInfo")
    @ResponseBody
    public ModelMap getCourseInfo(Long id){
        if(null != id && id > 0){
            Course course = courseService.getCourseById(id);
            if(null != course){
                return getSuccessResult(course);
            }
            return getFailResult(201,"未查到课程信息");
        }
        return getFailResult(201,"参数错误");
    }

    @PostMapping("/publish")
    @ResponseBody
    public ModelMap publish(CourseForm form){
        if (null != form){
            if (StringUtils.isEmpty(form.getTitle()) || StringUtils.isEmpty(form.getDescrip())
                    || StringUtils.isEmpty(form.getGmtLecture()) || StringUtils.isEmpty(form.getAddr())
                    || !form.checkQuotaNum() || !form.checkExcessNum()){
                return getFailResult(201, "参数错误");
            }
            Course course;
            if (null != form.getId() && form.getId() > 0){//更新
                course = new Course();
            }else {               //创建
                course = new Course();
            }
            course.setTitle(form.getTitle());
            course.setDescrip(form.getDescrip());
            course.setAudience(form.getAudience());
            course.setGmtLecture(new Date(form.getGmtLecture()));
            course.setAddr(form.getAddr());
            course.setQuotaNum(form.getQuotaNum());
            course.setExcessNum(form.getExcessNum());
            course.setLecturerId(3L);//默认取到当前用户的ID为3
            course.setStage((byte)1);
            System.out.println(course);
            Map<String, Object> data = new HashMap<>();
            data.put("id",courseService.add(course));
            return getSuccessResult(data);
        }
        return getFailResult(201);
    }

    @PostMapping("/cmtUpdate")
    @ResponseBody
    public ModelMap cmtUpdate(CourseForm form){
        if (null != form && form.getId() > 0) {
            if (StringUtils.isEmpty(form.getTitle()) || StringUtils.isEmpty(form.getDescrip())
                    || StringUtils.isEmpty(form.getGmtLecture()) || StringUtils.isEmpty(form.getAddr())
                    || !form.checkQuotaNum() || !form.checkExcessNum()) {
                return getFailResult(201, "参数错误");
            }
            Course course = courseService.getCourseById(form.getId());
            if(null != course){
                if(course.getStage() > 1){
                    course.setGmtLecture(new Date(form.getGmtLecture()));
                    course.setAddr(form.getAddr());
                }
                if(course.getStage() == 1){
                    course.setTitle(form.getTitle());
                    course.setDescrip(form.getDescrip());
                    course.setAudience(form.getAudience());
                    course.setQuotaNum(form.getQuotaNum());
                    course.setExcessNum(form.getExcessNum());
                }
                System.out.println(course);
                if(courseService.update(course)){
                    return getSuccessResult();
                }
            }
        }
        return getFailResult(201);
    }
}
