package com.learn.test.api.provider.service.jms;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author geweijian
 * @data 2017-09-22
 */

public class JMS {

    public static void main(String[] args) {
        try {
            sendMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Autowired
    private static MessageSender messageSender;

    public static void sendMessage() throws Exception {
        String message = "哈哈哈哈哈";

        messageSender.send(message);
    }
}
