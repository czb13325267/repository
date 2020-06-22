package com.aaa.czb.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author 十八
 */
@SpringBootApplication
@MapperScan("com.aaa.czb.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class,args);
    }
}
