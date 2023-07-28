package com.hzhiping.service;

import com.hzhiping.domain.Order;

/**
 * @author hzhiping
 * @date 2023/04/12
 */
public interface OrderService {
    /**
     * 新建订单
     *
     * @param order 订单信息
     */
    void create(Order order);
}