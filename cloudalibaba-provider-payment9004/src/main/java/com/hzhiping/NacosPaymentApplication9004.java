package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hzhiping
 * @date 2023/03/25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentApplication9004 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplication9004.class, args);
    }
}