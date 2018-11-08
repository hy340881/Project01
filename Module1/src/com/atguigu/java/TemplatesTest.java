package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

public class TemplatesTest {

    public static void main(String[] args) {
        System.out.println();
        String str="1";
        String str1="2";
        System.out.println("str1 = " + str1);
        System.out.println(str);
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }
}
