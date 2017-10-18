package com.learn.test.api.provider;

import com.learn.test.api.provider.service.AopTestService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author geweijian
 * @data 2017-09-14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServerApplication.class)
public class AopTest {

    @Autowired
    public AopTestService aopTestService;

    @org.junit.Test
    public void test(){
        aopTestService.setAop("哈啊哈");
    }
}
