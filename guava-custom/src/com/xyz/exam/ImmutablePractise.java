package com.xyz.exam;

import java.util.ArrayList;
import java.util.List;

/**
 * 不可变集合的练习
 *
 * @author xiao
 * @create 2017-03-15 20:04
 **/
public class ImmutablePractise {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        String[] s = (String[]) list.toArray(new String[list.size()]);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
