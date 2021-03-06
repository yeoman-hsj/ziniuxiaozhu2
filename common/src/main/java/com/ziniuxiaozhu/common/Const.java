package com.ziniuxiaozhu.common;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;

/**
 * Created by yeoman on 2017/7/15.
 */
public interface Const {
    static final class ReturnCode {
        /** 请求成功 */
        public static final int OK = 200;
        /** 参数错误 */
        public static final int F_201 = 201;
        /** 无操作权限 */
        public static final int F_202 = 202;
        /** 不支持该操作 */
        public static final int F_203 = 203;
        /** 无需重复操作 */
        public static final int F_204 = 204;
        /** 数据解析失败 */
        public static final int F_205 = 205;
        /** 超出最大支持的大小 */
        public static final int F_206 = 206;

        /** 未查到数据 */
        public static final int F_301 = 301;
        /** 系统保存失败 */
        public static final int F_303 = 303;
    }

    static final class CourseRule {
        /** 发布初始化规则 */
        public static final long PUBLISH_INIT = 123L;
    }

    /** 课程阶段 */
    static final class CourseStage {
        /** 发布 */
        public static final byte PUBLISH = 0;
        /** 审核 */
        public static final byte REVIEW = 1;
        /** 保留 */
        public static final byte STAY = 2;
        /** 报名 */
        public static final byte SIGNUP = 3;
        /** 闭课 */
        public static final byte CLOSED = 4;
        /** 开课 */
        public static final byte START = 5;
        /** 结课 */
        public static final byte COMPLETE = 6;
        /** 公开 */
        public static final byte OPEN = 7;

        public static final Map<Byte, String> mapper;
        static {
            mapper = new HashMap<>();
            mapper.put(PUBLISH, "发布中");
            mapper.put(REVIEW, "审核中");
            mapper.put(STAY, "已保留");
            mapper.put(SIGNUP, "报名中");
            mapper.put(CLOSED, "已闭课");
            mapper.put(START, "开课中");
            mapper.put(COMPLETE, "已结课");
            mapper.put(OPEN, "已公开");
        }
    }

    final class ResDir {
        /** 封面图片目录 */
        public static final String COVER = "cover/";
    }
}
