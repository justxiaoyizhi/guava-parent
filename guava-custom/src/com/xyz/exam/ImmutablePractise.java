package com.xyz.exam;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 不可变集合的练习
 *
 * @author xiao
 * @create 2017-03-15 20:04
 **/
public class ImmutablePractise {
    public static void main(String[] args) {
        ImmutablePractise practise = new ImmutablePractise();
        practise.testDefensiveCopy();
    }

    @Test
    public void testDefensiveCopy() {
        Person person = new Person("xiao",new Date());
        System.out.println(person.getName());
        System.out.println(person.getBirth().toLocaleString());
    }

    @Test
    public void testDefensiveCopy2() {
        Person person = new Person("xiao",new Date());
        person.getBirth().setYear(1);
        System.out.println(person.getName());
        System.out.println(person.getBirth().toLocaleString());
    }

    @Test
    public void testUnmodifiable() {
        List list1 = new ArrayList();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List list2 = Collections.unmodifiableList(list1);
        ImmutableList list3 = ImmutableList.copyOf(list1);

        list1.remove(1);

        System.out.println(list3);
        System.out.println(list1);
        System.out.println(list2);
    }

    @Test
    public void testAsList() {
        ImmutableSet set = ImmutableSet.of(1,53,753,8645,356,5676,35);
        System.out.println(set.asList().get(2));
    }

    @Test
    public void testList() {
        List list = ImmutableList.of("a","b","c","d");
        System.out.println(list);
    }
}
