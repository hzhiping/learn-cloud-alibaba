package com.hzhiping.config;

import com.hzhiping.interceptor.PaymentFeignInterceptor;
import feign.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author hzhiping
 * @date 2023/02/12
 */
@SuppressWarnings("ALL")
@Configuration
@PropertySource(value = {"classpath:auth.properties"})
public class FeignConfig {
    @Autowired
    private Environment env;

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public PaymentFeignInterceptor paymentFeignInterceptor() {
        String propertyValue = env.getProperty("hzhiping.authorization");
        return new PaymentFeignInterceptor(propertyValue);
    }

    /**
     * 如果使用@RequestLine注解的话，需要将这个契约打开
     *
     * @return feign的契约
     */
    //@Bean
    //public Contract feignContract() {
    //    return new Contract.Default();
    //}
}