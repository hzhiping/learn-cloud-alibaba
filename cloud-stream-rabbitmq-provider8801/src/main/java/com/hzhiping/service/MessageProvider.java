package com.hzhiping.service;

/**
 * @author hzhiping
 * @date 2023/03/01
 */
public interface MessageProvider {

    /**
     * 发送消息
     *
     * @return {@link String}
     */
    String send();
}