package com.linjing.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cxc
 * @date 2019/1/18 14:05
 */
@RestController
@EnableBinding(SinkSender.class)
public class SendController {
    @Autowired
    private SinkSender sinkSender;


    /**
     * 发送消息
     */
    @RequestMapping("send")
    public String send() {
        sinkSender.output().send(MessageBuilder.withPayload("嘿嘿嘿").build());
        return "发送成功";
    }
}
