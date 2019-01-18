package com.linjing.customer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * 通道~~~
 *
 * @author cxc
 * @date 2019/1/18 16:12
 */
@Component
public interface ChannelMessage {
    String OUTPUT = "firstMe";

    @Input(ChannelMessage.OUTPUT)
    MessageChannel Input();
}
