package com.hzhiping.service;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hzhiping
 * @date 2023/04/13
 */
public interface AccountService {

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}