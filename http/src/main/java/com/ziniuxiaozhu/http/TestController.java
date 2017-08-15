package com.ziniuxiaozhu.http;

import com.ziniuxiaozhu.service.interfaces.IUmNewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by yeoman on 2017/3/13.
 */
@Controller
public class TestController {

    @Resource
    private IUmNewsService umNewsService;
	
	@GetMapping("/testGet")
    @ResponseBody
    public String testGet() {
        return "<br><p style='text-align:center;font-size:2em;'>成功！</p><div><a href='/course.html'>发布课程</a>";
    }

    @GetMapping("/getNewsById")
    @ResponseBody
    public String getNewsById(Long id){
        return umNewsService.getOne(id).toString();
    }

    @GetMapping("/restFull/{id}")
    @ResponseBody
    public String restFull(@PathVariable Long id){
        return "<br><p style='text-align:center;font-size:2em;'>成功！</p>" +
                "<p style='text-align:center;font-size:2em;'>"+id+"</p>";
    }

}