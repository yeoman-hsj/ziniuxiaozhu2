package com.ziniuxiaozhu.http;

import com.ziniuxiaozhu.common.Const;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

/**
 * Created by yeoman on 2017/7/14.
 */
public class BaseController {

    public static final String SUCCESS = "success";
    public static final String CODE = "code";
    public static final String DATA = "data";
    public static final String MSG = "msg";

    long getUserId(){
        return 3L;//默认取到当前用户的ID为3
    }
    boolean isAdmin(){
        return 3 == getUserId();
    }

    String getUserName(){
        return "好事达";//默认取到当前用户的ID为3的用户名
    }

    ModelMap getSuccessResult(){
        ModelMap modelMap = new ModelMap();
        modelMap.put(SUCCESS, true);
        modelMap.put(CODE, Const.ReturnCode.OK);
        modelMap.put(MSG, "成功");
        return modelMap;
    }

    ModelMap getSuccessResult(Object data){
        ModelMap modelMap = getSuccessResult();
        modelMap.put(DATA, data);
        return modelMap;
    }

    ModelMap getFailResult(int failCode){
        ModelMap modelMap = new ModelMap();
        modelMap.put(SUCCESS, false);
        modelMap.put(CODE, failCode);
        return modelMap;
    }

    ModelMap getFailResult(int failCode, Object data){
        ModelMap modelMap = getFailResult(failCode);
        modelMap.put(DATA, data);
        return modelMap;
    }

    ModelMap getFailResult(int failCode, String msg){
        ModelMap modelMap = getFailResult(failCode);
        modelMap.put(MSG, msg);
        return modelMap;
    }

    ModelMap getFailResult(int failCode, String msg, Object data){
        ModelMap modelMap = getFailResult(failCode, msg);
        modelMap.put(DATA, data);
        return modelMap;
    }
}
