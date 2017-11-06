package com.learn.test.java8;

import java.util.Arrays;
import java.util.List;


/**
 * @author geweijian
 * @data 2017-11-01
 */
public class Java8Test {


    public static void main(String[] args) {
        Integer[] a = new Integer[]{0, 0, 0, 0, 0, 0, 0};
        List<Integer> ab = Arrays.asList(a);
        ab.stream().forEach(i ->
            a[i] = a[i] +1
        );
        System.out.println(ab);

    }
}
