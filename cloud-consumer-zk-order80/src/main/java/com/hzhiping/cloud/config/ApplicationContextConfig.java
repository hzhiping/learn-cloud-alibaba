package com.hzhiping.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author hzhiping
 * @date 2023/02/01
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * 如果开启负载均衡不加此注解，将导致java.net.UnknownHostException: CLOUD-PAYMENT-SERVICE with root cause
     *
     * @return {@link RestTemplate}
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}