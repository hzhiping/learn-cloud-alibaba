package com.hzhiping.controller;

import javax.annotation.Resource;

import com.hzhiping.entity.User;
import com.hzhiping.service.UserFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hzhiping.entity.CommonResult;
import com.hzhiping.entity.Payment;
import com.hzhiping.service.PaymentFeignService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hzhiping
 * @date 2023/02/12
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @Resource
    private UserFeignService userFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/getWithHeader/{id}")
    public CommonResult<Payment> getPaymentByIdWithHeader(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentByIdWithHeader(id);
    }

    @GetMapping(value = "/consumer/payment/getWithHeaderAnno/{id}")
    public CommonResult<Payment> getPaymentByIdWithHeaderAnno(@PathVariable("id") Long id) {
        // return paymentFeignService.getPaymentByIdWithHeaderAnno(id);
        return null;
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }

    @GetMapping(value = "/consumer/getUser")
    public CommonResult<User> getUser() {
        return userFeignService.getUser();
    }
}