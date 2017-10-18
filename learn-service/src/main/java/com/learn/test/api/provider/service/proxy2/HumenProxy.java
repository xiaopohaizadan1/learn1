package com.learn.test.api.provider.service.proxy2;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author geweijian
 * @data 2017-09-15
 */
public class HumenProxy implements InvocationHandler {

    private Object tagert;

    public HumenProxy(Object tagert) {
        this.tagert = tagert;
    }

    /**
     * invoke方法用来实现代理所需要实现的
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(tagert, args);

        return result;
    }

    public void before() {
        System.out.println("实现方法前所做的操作");
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                tagert.getClass().getClassLoader(),
                tagert.getClass().getInterfaces(),
                this);
    }

}
