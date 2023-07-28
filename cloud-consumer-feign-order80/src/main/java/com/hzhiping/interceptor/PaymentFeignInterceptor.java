package com.hzhiping.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.Data;

/**
 * @author hzhiping
 * @date 2023/04/15
 */
@Data
public class PaymentFeignInterceptor implements RequestInterceptor {
    private String authorization;

    public PaymentFeignInterceptor(String authorization) {
        this.authorization = authorization;
    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("authorization", this.authorization);
    }
}