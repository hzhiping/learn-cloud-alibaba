package com.hzhiping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hzhiping
 * @date 2023/03/10
 */
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        // try {
        // TimeUnit.SECONDS.sleep(1);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        log.info("testD，测试RT");
        int i = 10 / 0;
        return "testD，测试RT";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE，测试异常数");
        int i = 10 / 0;
        return "testE，测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "dealHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
        @RequestParam(value = "p2", required = false) String p2) {
        // 添加异常
        int i = 10 / 0;
        return "test hot key~";
    }

    public String dealHotKey(String p1, String p2, BlockException exception) {
        return "deal hot key ~~~😭~~~";// sentinel默认提示：Blocked by Sentinel (flow limiting)
    }
}