package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hzhiping
 * @date 2023/02/11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk80Application {
    public static void main(String[] args) {
        SpringApplication.run(OrderZk80Application.class, args);
    }
}