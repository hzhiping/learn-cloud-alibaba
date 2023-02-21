package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hzhiping
 * @date 2023/02/19
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWay9527Application {
    public static void main(String[] args) {
        SpringApplication.run(GateWay9527Application.class, args);
    }
}