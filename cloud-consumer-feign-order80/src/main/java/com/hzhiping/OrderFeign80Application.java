package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hzhiping
 * @date 2023/02/12
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeign80Application {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign80Application.class, args);
    }
}