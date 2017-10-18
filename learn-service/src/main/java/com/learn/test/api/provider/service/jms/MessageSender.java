package com.learn.test.api.provider.service.jms;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.io.Serializable;

/**
 * 发送信息
 *
 * @author geweijian
 * @data 2017-09-23
 */
@Component
public class MessageSender implements ActiveMQSender {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Bean
    public Queue myQueue(){
        return new ActiveMQQueue("test.common.send");
    }

    @Override
    public void send(Serializable message) throws Exception {
        jmsMessagingTemplate.convertAndSend(myQueue(),message);
    }
}
