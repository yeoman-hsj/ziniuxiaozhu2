package com.ziniuxiaozhu.http;

import com.ziniuxiaozhu.common.Const;
import com.ziniuxiaozhu.data.entity.Course;
import com.ziniuxiaozhu.service.interfaces.ICourseService;
import com.ziniuxiaozhu.service.interfaces.IResService;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 上传课程封面
 * Created by yeoman on 2017/8/30.
 */
@RestController
public class UploadCoverController extends BaseController {

    @Resource
    private IResService resService;
    @Resource
    private ICourseService courseService;

    @PostMapping("/course/uploadCover")
    @ResponseBody
    public ModelMap uploadCover(Long rid, String title, String image){
        if(null == rid || rid < 1 || StringUtils.isEmpty(title) || StringUtils.isEmpty(image)){
            return getFailResult(Const.ReturnCode.F_201, "参数错误");
        }
        if(image.length() > 349549){
            return getFailResult(Const.ReturnCode.F_206, "超出最大支持的大小");
        }
        String header ="data:image/jpeg;base64,";
        if(image.indexOf(header) != 0){
            return getFailResult(Const.ReturnCode.F_205, "数据解析失败");
        }
        image = image.substring(header.length());

        if(resService.uploadCover(rid, title, image)){
            //上传成功后，更改课程状态为审核中
            Course course = new Course();
            course.setId(rid);
            course.setStage(Const.CourseStage.REVIEW);
            courseService.update(course);
            return getSuccessResult();
        }
        return getFailResult(Const.ReturnCode.F_303, "系统保存失败");
    }
}
