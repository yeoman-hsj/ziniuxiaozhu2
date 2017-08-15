package com.ziniuxiaozhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 工程启动入口类
 * Created by yeoman on 2017/3/13.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        System.out.println("main func start...");
        SpringApplication.run(Application.class, args);
    }
}
