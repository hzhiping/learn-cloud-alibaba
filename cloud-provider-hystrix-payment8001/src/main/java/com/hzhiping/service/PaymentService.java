package com.hzhiping.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import cn.hutool.core.util.IdUtil;

/**
 * @author hzhiping
 * @date 2023/02/16
 */
@Service
public class PaymentService {
    /**
     * 正常访问，肯定OK
     *
     * @param id id
     * @return {@link String}
     */
    public String paymentInfo(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "，paymentInfo，id：" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler", commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")})
    public String paymentInfoTimeOut(Integer id) {
        // int age = 10/0;
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "，id：" + id + "\t" + "O(∩_∩)O哈哈~" + "，耗时(秒)：";
    }

    public String paymentInfoTimeOutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "，8001系统繁忙或者运行报错，请稍后再试，id：" + id + "\t" + "o(╥﹏╥)o";
    }

    /**
     * 服务熔断
     *
     * @param id id
     * @return {@link String}
     */
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback",
        commandProperties = {@HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), // 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),// 失败率达到多少后跳闸
        })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("******id不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;
    }

    public String paymentCircuitBreakerFallback(@PathVariable("id") Integer id) {
        return "id不能负数，请稍后再试，/(ㄒoㄒ)/~~，id：" + id;
    }
}