package com.learn.test.api.provider.service.proxy;

/**
 * @author geweijian
 * @data 2017-09-14
 */
public class HumenProxy implements Humen{

    private Humen humen;

    public HumenProxy(){
        humen = new HumenImpl();
    }

    @Override
    public void eat() {
       before();
       humen.eat();
       after();
    }

    public void before(){
        System.out.println("做饭");
    }

    public void after(){
        System.out.println("打扫");
    }
}
