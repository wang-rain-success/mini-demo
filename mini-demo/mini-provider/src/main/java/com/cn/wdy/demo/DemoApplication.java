package com.cn.wdy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cn.wdy.demo.dao")
//@NacosPropertySource(dataId = "wdy-demo",groupId = "wdy-demo",autoRefreshed = true)
public class DemoApplication {


    public static void main(String[] args) {

        System.setProperty("nacos.logging.default.config.enabled", "false");

        SpringApplication.run(DemoApplication.class, args);
    }

}
