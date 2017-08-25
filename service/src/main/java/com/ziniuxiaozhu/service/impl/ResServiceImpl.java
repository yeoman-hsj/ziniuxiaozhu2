package com.ziniuxiaozhu.service.impl;

import com.ziniuxiaozhu.data.entity.ResBase;
import com.ziniuxiaozhu.data.entity.ResCover;
import com.ziniuxiaozhu.data.mapper.CourseMapper;
import com.ziniuxiaozhu.data.mapper.ResMapper;
import com.ziniuxiaozhu.service.interfaces.IResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by yeoman on 2017/8/24.
 */
@Service
public class ResServiceImpl implements IResService {

    @Autowired
    private ResMapper resMapper;

    @Override
    public String getResCoverImgUrl(Long relateId) {
        if (relateId == null || relateId < 1)
            return null;
        ResBase resCover = resMapper.selectOneById(relateId);
        if(null != resCover){
            //如果直接存的是图片的URL，则直接返回URL
            if(!StringUtils.isEmpty(resCover.getUrl())){
                return resCover.getUrl();
            }
            StringBuilder sb = new StringBuilder(resCover.getDir());
            sb.append(resCover.getName()).append(".").append(resCover.getSuffix());
            return sb.toString();
        }
        return null;
    }
}
