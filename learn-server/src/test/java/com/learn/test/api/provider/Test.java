package com.learn.test.api.provider;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author geweijian
 * @data 2017-08-25
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServerApplication.class)
public class Test {
    @Autowired
    private YmlConfig ymlConfig;

    @org.junit.Test
    public void test(){

//        System.out.println(ymlConfig.getNfq());

        System.out.println(ymlConfig.getUser());
        System.out.println(ymlConfig.getUser().get(0));
        System.out.println(ymlConfig.getUser().get(1));
    }
}
