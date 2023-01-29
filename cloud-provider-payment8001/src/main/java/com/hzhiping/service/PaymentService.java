package com.hzhiping.service;

import com.hzhiping.entity.Payment;

/**
 * @author hzhiping
 * @date 2023/01/29
 */
public interface PaymentService {
    /**
     * 插入支付实体
     *
     * @param payment 支付
     * @return int
     */
    int create(Payment payment);

    /**
     * 根据ID获取到支付的对象
     *
     * @param id id
     * @return {@link Payment}
     */
    Payment getPaymentById(Long id);
}