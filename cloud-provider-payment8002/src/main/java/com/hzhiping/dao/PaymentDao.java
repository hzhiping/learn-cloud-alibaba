package com.hzhiping.dao;

import com.hzhiping.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hzhiping
 * @date 2023/01/29
 */
@Mapper
//@Repository//不用Spring的
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}