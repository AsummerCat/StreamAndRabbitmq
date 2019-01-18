package com.linjing.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(ChannelMessage.class)
public class SinkReceiver {

    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(ChannelMessage.OUTPUT)
    public void receive(String payload) {
        logger.info("Received: " + payload);
    }
    @StreamListener(ChannelMessage.OUTPUT)
    public void receive2(String payload) {
        logger.info("Received2: " + payload);
    }

}