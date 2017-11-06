package com.learn.test.learn;

import java.io.Console;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输出和输入
 *
 * @author geweijian
 * @data 2017-11-03
 */
public class InOut {
    public static void main(String[] args) {

        /**
         * Scanner 类

         Scanner scn = new Scanner(System.in);

         System.out.println("请输入名字");
         String name = scn.nextLine();

         System.out.println("请输入年纪");
         int  age = scn.nextInt();

         System.out.println("你好"+name+age);

         scn.close();

         */

//        Console so = System.console();
//        String username = so.readLine("用户名",100);
//        char[] password = so.readPassword("密码",100);


//        Scanner in  =  new Scanner(Paths.get("/Users/xiaobai/Desktop/javascript/a.text"),"UTF-8");
//
//        if (in.hasNext()){
//            System.out.println(in.next());
//        }
//
//        in.close();

//        System.out.println("1‬".length());
//        System.out.println("1".length());

//        int[] a = new int[10];
//
//        int[] b = new int[]{1,35,55,4,6};
//
//        int[] c = new int[0];
//
//        int[] d = {};
//
//        System.out.println(Arrays.toString(c));
//        System.out.println(Arrays.toString(d));


        for (int i= 0;i< args.length;i++){
            System.out.println("------->"+args[i]);
        }

    }
}
