package com.hzhiping.service;

import com.hzhiping.entity.CommonResult;
import com.hzhiping.entity.User;
import com.hzhiping.interceptor.FeignRequestInterceptor1;
import com.hzhiping.interceptor.FeignRequestInterceptor2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author hzhiping
 * @date 2023/10/6
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE", configuration = {FeignRequestInterceptor2.class, FeignRequestInterceptor1.class})
public interface UserFeignService {
    @PostMapping(value = "/getUser")
    CommonResult<User> getUser();
}