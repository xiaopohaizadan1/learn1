package com.learn.test.api.provider.service.reflect;

import com.learn.test.api.provider.entity.ApplyEntity;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * @author geweijian
 * @data 2017-09-15
 */
public class ReflectTest {

    public static void main(String[] args) {

       Method method = ReflectionUtils.findMethod(ApplyEntity.class,"eat");
       System.out.println(method);

//        ReflectionUtils.
    }
}
