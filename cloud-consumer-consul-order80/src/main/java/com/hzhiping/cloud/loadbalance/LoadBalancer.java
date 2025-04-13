package com.hzhiping.cloud.loadbalance;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

/**
 * @author hzhiping
 * @date 2023/02/01
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}