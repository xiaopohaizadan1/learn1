package com.learn.test.api.provider.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author geweijian
 * @data 2017-09-04
 */
@Aspect
@Component
public class AopPiontcut {

    @Pointcut("execution(* com.learn.test.service.*.*(..))")
    public void cut() {}

    @Before("cut()")
    public void setBefore() {
        System.out.println("==============插入的方法在，在切点之前");
    }

}
