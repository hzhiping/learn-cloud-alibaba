package com.hzhiping.service;

import com.hzhiping.entity.CommonResult;
import com.hzhiping.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author hzhiping
 * @date 2023/03/26
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}