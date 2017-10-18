package com.learn.test.api.provider.service.proxy;

/**
 * @author geweijian
 * @data 2017-09-14
 */
public class ProxyTest {
//    //静态代理需要自己实现代理类
//    public static void main(String[] args) {
//        HumenProxy humenProxy = new HumenProxy();
//        humenProxy.eat();
//    }

    public static void main(String[] args) {
        Humen humen = new HumenImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(humen);
        Humen humenProxy = dynamicProxy.getProxy();
        humenProxy.eat();
    }

}
