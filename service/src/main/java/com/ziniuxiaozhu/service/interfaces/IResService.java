package com.ziniuxiaozhu.service.interfaces;

import com.qiniu.storage.model.FileInfo;
import com.ziniuxiaozhu.data.entity.ResCover;

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

    /**
     * 上传封面图片
     * @param relateId 课程ID
     * @param name 课程主题
     * @param image 封面图片Base64
     * @return
     */
    boolean uploadCover(Long relateId, String name, String image);

}
