package com.hzhiping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hzhiping
 * @date 2023/03/03
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosPaymentApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplication9002.class, args);
    }
}