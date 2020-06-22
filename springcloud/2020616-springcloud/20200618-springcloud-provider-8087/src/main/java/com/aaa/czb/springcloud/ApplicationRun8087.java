package com.aaa.czb.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.czb.springcloud.mapper")
public class ApplicationRun8087 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8087.class,args);
    }
}
