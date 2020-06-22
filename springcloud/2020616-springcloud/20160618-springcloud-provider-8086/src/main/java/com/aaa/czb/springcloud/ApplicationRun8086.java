package com.aaa.czb.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.aaa.czb.springcloud.mapper")
public class ApplicationRun8086 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8086.class,args);
    }
}
