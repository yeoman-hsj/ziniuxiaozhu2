package com.ziniuxiaozhu.common;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 七牛云对象存储工具类
 * Created by yeoman on 2017/8/29.
 */
public class QiniuFileUtil {

    private static final Logger log = LoggerFactory.getLogger(QiniuFileUtil.class);

    private static final String ACCESS_KEY = "Slv9yyHeZ-Jvn8BkD5Frk_k5XIL4EitV8QFaPsHu";
    private static final String SECRET_KEY = "turuVFxhmQdbFhJOf-7_3pQrwFCwpnnoEGZ-H37b";
    public static final String URL_IMG = "url-img";
    public static final String DOMAIN_NAME = "http://ovft3n4xt.bkt.clouddn.com/";

    private static Configuration cfg;
    private static UploadManager uploadManager;
    private static Auth auth;
    private static BucketManager bucketManager;

    static {
        cfg = new Configuration(Zone.zone2());
        uploadManager = new UploadManager(cfg);
        try {
            auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        bucketManager = new BucketManager(auth, cfg);
    }

    /**
     * 上传单个文件
     * @param uploadBytes
     * @param key
     * @return 文件外链URL
     */
    public static String putCoverImgRetUrl(byte[] uploadBytes, String key){
        try {
            String upToken = auth.uploadToken(URL_IMG, key);
            Response response = uploadManager.put(uploadBytes, key, upToken);
            log.info(response.bodyString());

            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            return DOMAIN_NAME + putRet.key;
        } catch (QiniuException qe) {
            log.error(qe.response.toString());
            try {
                log.error(qe.response.bodyString());
            } catch (QiniuException qex) {
                qex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 上传单个文件
     * @param uploadBytes 字节数组
     * @param key 文件名
     * @return 文件信息
     */
    public static FileInfo putCoverImgRetInfo(byte[] uploadBytes, String key){
        try {
            String upToken = auth.uploadToken(URL_IMG, key);
            Response response = uploadManager.put(uploadBytes, key, upToken);
            log.info(response.bodyString());

            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            return bucketManager.stat(URL_IMG, putRet.key);
        } catch (QiniuException qe) {
            log.error(qe.response.toString());
            try {
                log.error(qe.response.bodyString());
            } catch (QiniuException qex) {
                qex.printStackTrace();
            }
        }
        return null;
    }

    public static void deleteCoverImg(String key){
        try {
            bucketManager.delete(URL_IMG, key);
        } catch (QiniuException e) {
            log.error("错误码：" + e.code());
            log.error(e.response.toString());
        }
    }
}
