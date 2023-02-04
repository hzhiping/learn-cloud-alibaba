package com.hzhiping.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * @author hzhiping
 * @date 2023/02/01
 */
@Configuration
public class MySelfRule {
    public IRule myRule() {
        //定义为随机
        return new RandomRule();
    }
}