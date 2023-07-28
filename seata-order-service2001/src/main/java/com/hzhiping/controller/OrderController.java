package com.hzhiping.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzhiping.domain.CommonResult;
import com.hzhiping.domain.Order;
import com.hzhiping.service.OrderService;

/**
 * @author hzhiping
 * @date 2023/04/12
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}