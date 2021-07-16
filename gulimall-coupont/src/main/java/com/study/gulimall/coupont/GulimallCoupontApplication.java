package com.study.gulimall.coupont;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.study.gulimall.coupont.dao")
public class GulimallCoupontApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCoupontApplication.class, args);
    }

}
