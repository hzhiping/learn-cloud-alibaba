package com.hzhiping.service;


/**
 * @author hzhiping
 * @date 2023/04/13
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}