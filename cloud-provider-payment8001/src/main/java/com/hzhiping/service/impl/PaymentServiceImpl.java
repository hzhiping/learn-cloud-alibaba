package com.hzhiping.service.impl;

import com.hzhiping.dao.PaymentDao;
import com.hzhiping.entity.Payment;
import com.hzhiping.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hzhiping
 * @date 2023/01/29
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}