package com.learn.test.api.provider.service.proxy2;

/**
 * @author geweijian
 * @data 2017-09-15
 */
public class proxyTest {
    public static void main(String[] args) {
        Humen humen  = new HumenImpl();
        HumenProxy humenProxy = new HumenProxy(humen);
        humen = humenProxy.getProxy();
        humen.eat();
    }
}
