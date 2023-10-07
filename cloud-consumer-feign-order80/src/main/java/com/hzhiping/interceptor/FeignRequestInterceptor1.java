package com.hzhiping.interceptor;

import cn.hutool.core.util.StrUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @author hzhiping
 * @date 2023/10/6
 */
@Configuration // 全局拦截
public class FeignRequestInterceptor1 implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        String uuid = StrUtil.uuid();
        requestTemplate.header("headerId", uuid);
    }
}