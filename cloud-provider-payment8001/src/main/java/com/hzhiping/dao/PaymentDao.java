package com.hzhiping.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hzhiping.entity.Payment;

/**
 * @author hzhiping
 * @date 2023/01/29
 */
@Mapper
// @Repository//不用Spring的
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}