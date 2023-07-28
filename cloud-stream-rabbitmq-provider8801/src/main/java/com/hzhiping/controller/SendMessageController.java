package com.hzhiping.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzhiping.service.MessageProvider;

/**
 * @author hzhiping
 * @date 2023/03/01
 */
@RestController
public class SendMessageController {
    @Resource
    private MessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }

}