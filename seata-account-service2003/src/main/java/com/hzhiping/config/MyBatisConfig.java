package com.hzhiping.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hzhiping
 * @date 2023/04/13
 */
@Configuration
@MapperScan({"com.hzhiping.dao"})
public class MyBatisConfig {
}