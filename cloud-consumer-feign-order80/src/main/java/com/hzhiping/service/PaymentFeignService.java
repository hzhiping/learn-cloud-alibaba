package com.hzhiping.service;

import com.hzhiping.config.FeignConfig;
import com.hzhiping.entity.CommonResult;
import com.hzhiping.entity.Payment;
import com.hzhiping.interceptor.PaymentFeignInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hzhiping
 * @date 2023/02/12
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE", configuration = FeignConfig.class)
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

    //region 获取请求头的几种方式
    @RequestMapping(value = "/payment/get/{id}", method = RequestMethod.GET, headers = {"Authorization=xxx"})
    public CommonResult<Payment> getPaymentByIdWithHeader(@PathVariable("id") Long id);

    //@RequestLine(value = "GET /payment/get/{id}")
    //@Headers(value = {"Authorization: xxx"})
    //public CommonResult<Payment> getPaymentByIdWithHeaderAnno(@Param("id") Long id);
    //endregion
}