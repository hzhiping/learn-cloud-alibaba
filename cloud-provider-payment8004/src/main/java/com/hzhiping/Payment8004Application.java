package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hzhiping
 * @date 2023/01/31
 */
@SpringBootApplication
@EnableDiscoveryClient//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class Payment8004Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8004Application.class, args);
    }
}