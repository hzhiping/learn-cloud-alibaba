package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hzhiping
 * @date 2023/03/26
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosOrderApplication84 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication84.class, args);
    }
}