package com.learn.test.api.provider.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author geweijian
 * @data 2017-08-29
 */
@Data
@Builder
public class ApplyEntity {

    private String name;

    public void eat(){
        System.out.println("hah ");
    }
}
