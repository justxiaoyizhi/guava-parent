package com.xyz.exam;

import org.junit.Test;

import java.util.*;

/**
 * Created by Xiao on 2017/3/19.
 */
public class QuestionPractise {

    @Test
    public void testArrayListSort() {
        List list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }

    /**
     * ArrayList是有顺序的，Set是无顺序的，存储顺序和取出顺序不同
     */
    @Test
    public void testSort() {
        Set set = new HashSet();
        set.add(2);
        set.add(1);
        set.add(9);
        set.add(16);
        System.out.println(set);
    }

    /**
     * 数组和集合互转
     */
    @Test
    public void testInverse() {
        List list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] array = (Integer[]) list.toArray(new Integer[list.size()]);
        for (Integer integer : array) {
            System.out.println(integer);
        }
        List<Integer> integers = Arrays.asList(array);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    /**
     * addAll是否会互相影响
     */
    @Test
    public void testAddALl() {
        Collection c1 = new ArrayList();
        c1.add(1);
        c1.add(2);
        c1.add(3);

        Collection c2 = new ArrayList();
        c2.addAll(c1);

        c1.add(6);
        System.out.println(c1);
        System.out.println(c2);
    }
}
