package com.linjing.producer.controller;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface SinkSender {

    String OUTPUT = "firstMe";

    @Output(SinkSender.OUTPUT)
    MessageChannel output();




}
