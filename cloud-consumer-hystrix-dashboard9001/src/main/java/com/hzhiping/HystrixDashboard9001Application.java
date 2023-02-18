package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * @author hzhiping
 * @date 2023/02/18
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001Application {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001Application.class, args);
    }
}