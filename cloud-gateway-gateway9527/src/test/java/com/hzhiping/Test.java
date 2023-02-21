package com.hzhiping;

import java.time.ZonedDateTime;

/**
 * @author hzhiping
 * @date 2023/02/21
 */
public class Test {
    public static void main(String[] args) {
        //默认时区
        ZonedDateTime zbj = ZonedDateTime.now();
        System.out.println(zbj);
        //2020-02-21T15:51:37.485+08:00[Asia/Shanghai]
    }
}