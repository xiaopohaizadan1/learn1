package com.learn.test.api.provider.service.exception;

import com.learn.test.api.provider.service.exception.constant.ErrorEnum;
import com.learn.test.api.provider.service.exception.constant.Learn2Exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author geweijian
 * @data 2017-09-21
 */
public class ExceptionTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        List<String> list1 = new ArrayList<String>();

        list.add(10);
        list.add(12);
        list.add(10);
        list.add(23);

        for (Integer i : list) {
            try {
                reduce(i);
            } catch (Learn2Exception e) {
                list1.add(e.getErrMessage());
            }
        }
        System.out.println(list1);
    }

    private static void reduce(Integer i) throws Learn2Exception {
        if (10 - i == 0) {
            throw new Learn2Exception(ErrorEnum.MARKET, "错误");
        }
    }
}
