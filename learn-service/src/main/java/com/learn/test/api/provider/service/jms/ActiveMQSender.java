package com.learn.test.api.provider.service.jms;

import java.io.Serializable;

/**
 * @author geweijian
 * @data 2017-09-23
 */
public interface ActiveMQSender {
    void send(Serializable message) throws Exception;
}
