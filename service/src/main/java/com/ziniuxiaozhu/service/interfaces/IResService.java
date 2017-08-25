package com.ziniuxiaozhu.service.interfaces;

/**
 * 资源管理服务
 * Created by yeoman on 2017/8/24.
 */
public interface IResService {

    /**
     * 获取课程封面图片的URL
     * @param relateId 课程ID
     * @return
     */
    String getResCoverImgUrl(Long relateId);
}
