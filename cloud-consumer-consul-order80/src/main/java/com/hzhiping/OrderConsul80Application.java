package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hzhiping
 * @date 2023/02/12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsul80Application {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsul80Application.class, args);
    }
}