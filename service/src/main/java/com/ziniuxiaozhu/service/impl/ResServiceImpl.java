package com.ziniuxiaozhu.service.impl;

import com.qiniu.storage.model.FileInfo;
import com.ziniuxiaozhu.common.Const;
import com.ziniuxiaozhu.common.QiniuFileUtil;
import com.ziniuxiaozhu.data.entity.ResCover;
import com.ziniuxiaozhu.data.mapper.ResMapper;
import com.ziniuxiaozhu.service.interfaces.IResService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.util.StringUtils;


/**
 * Created by yeoman on 2017/8/24.
 */
@Service
public class ResServiceImpl implements IResService {

    private static final Logger log = LoggerFactory.getLogger(ResServiceImpl.class);

    @Autowired
    private ResMapper resMapper;

    @Override
    public String getResCoverImgUrl(Long relateId) {
        if (relateId == null || relateId < 1)
            return null;
        ResCover resCover = resMapper.selectCoverOneById(relateId);
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

    @Override
    public boolean uploadCover(Long relateId, String name, String image) {
        if(relateId != null && relateId > 0){
            ResCover resCover = resMapper.selectCoverOneById(relateId);
            if(resCover == null){
                //上传封面图片
                FileInfo retInfo = QiniuFileUtil.putCoverImgRetInfo(Base64Utils.decodeFromString(image), Const.ResDir.COVER + name);
                if(null == retInfo){
                    return false;
                }
                retInfo.key = name;
                //新增记录
                if(this.addCoverRec(relateId, retInfo)){
                    return true;
                }
                //删除当前上传的文件
                QiniuFileUtil.deleteCoverImg(Const.ResDir.COVER + name);
                return false;
            }
            //删除先前上传的文件
            QiniuFileUtil.deleteCoverImg(Const.ResDir.COVER + resCover.getName());
            //上传封面图片
            FileInfo retInfo = QiniuFileUtil.putCoverImgRetInfo(Base64Utils.decodeFromString(image), Const.ResDir.COVER + name);
            if(null == retInfo){
                return false;
            }
            retInfo.key = name;
            //更新记录
            if(this.updateCoverRec(resCover.getId(), retInfo)){
                return true;
            }
            log.error("上传封面图片成功，但更新表记录失败，课程ID：" + relateId);
            return false;
        }
        return false;
    }

    private boolean addCoverRec(Long relateId, FileInfo fileInfo) {
        ResCover cover = new ResCover();
        cover.setRelateId(relateId);
        cover.setName(fileInfo.key);
        cover.setSuffix("jpg");
        cover.setSize((int)fileInfo.fsize);
        cover.setHost(QiniuFileUtil.URL_IMG);
        cover.setDir(Const.ResDir.COVER);
        cover.setUrl(QiniuFileUtil.DOMAIN_NAME + Const.ResDir.COVER + fileInfo.key);
        return resMapper.insertCoverOne(cover) == 1;
    }

    private boolean updateCoverRec(Long id, FileInfo fileInfo) {
        ResCover cover = new ResCover();
        cover.setId(id);
        cover.setName(fileInfo.key);
        cover.setSuffix("jpg");
        cover.setSize((int)fileInfo.fsize);
        cover.setHost(QiniuFileUtil.URL_IMG);
        cover.setDir(Const.ResDir.COVER);
        cover.setUrl(QiniuFileUtil.DOMAIN_NAME + Const.ResDir.COVER + fileInfo.key);
        return resMapper.updateCover(cover) == 1;
    }
}
