package com.hzhiping.service;

import org.springframework.stereotype.Component;


/**
 * @author hzhiping
 * @date 2023/02/18
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo, o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfoTimeOut, o(╥﹏╥)o";
    }
}