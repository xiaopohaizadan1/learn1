package com.learn.test.api.provider.service;

import org.springframework.stereotype.Service;

/**
 * @author geweijian
 * @data 2017-09-04
 */
@Service
public class AopTestService {

    
    public void setAop(String name) {
        System.out.println("------------->" + name);
    }
}
