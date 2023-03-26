package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hzhiping
 * @date 2023/03/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderApplication84 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderApplication84.class, args);
    }
}