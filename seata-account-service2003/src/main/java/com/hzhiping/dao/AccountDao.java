package com.hzhiping.dao;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hzhiping
 * @date 2023/04/13
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     *
     * @param userId 用户ID
     * @param money 钱
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}