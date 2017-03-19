package com.xyz.exam;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Xiao on 2017/3/19.
 */
public class MultiMapPractise {

    @Test
    public void testListMultiMap() {
        ListMultimap listMultimap = ArrayListMultimap.create();
        List listA = listMultimap.get("a");
        listA.add(2);
        listA.add(1);
        listA.add(2);
        listA.add(3);
        System.out.println("listMultimap:" + listMultimap);
    }

    /**
     * 使用不可变集合填充数据
     */
    @Test
    public void testListMultiMap2() {
        ListMultimap listMultimap = ArrayListMultimap.create();
        List listA = listMultimap.get("a");
        listA.add(2);
        listA.addAll(ImmutableList.of(1, 2, 3));
        System.out.println("listMultimap:" + listMultimap);
    }

    /**
     * 使用put和putAll
     */
    @Test
    public void testListMultiMap3() {
        ListMultimap listMultimap = ArrayListMultimap.create();
        listMultimap.put("a", 2);
        listMultimap.putAll("a", ImmutableList.of(1, 2, 3));
        System.out.println("listMultimap:" + listMultimap);
    }

    /**
     * 使用remove和removeAll
     */
    @Test
    public void testListMultiMap4() {
        ListMultimap listMultimap = ArrayListMultimap.create();
        listMultimap.put("a", 2);
        listMultimap.putAll("a", ImmutableList.of(1, 2, 3));
        System.out.println(listMultimap.remove("a", 2));
        System.out.println(listMultimap.remove("a", 2));
        System.out.println(listMultimap.remove("a", 2));
        System.out.println(listMultimap.remove("b", 2));
        System.out.println("listMultimap:" + listMultimap);
    }

    /**
     * 使用replaceValues
     */
    @Test
    public void testListMultiMap5() {
        ListMultimap listMultimap = ArrayListMultimap.create();
        listMultimap.put("a", 2);
        listMultimap.putAll("a", ImmutableList.of(1, 2, 3));
        listMultimap.replaceValues("a", ImmutableList.of(5, 6, 7));
        System.out.println("listMultimap:" + listMultimap);
    }

    /**
     * 多种返回视图
     */
    @Test
    public void testListMultiMap6() {
        ListMultimap listMultimap = ArrayListMultimap.create();
        listMultimap.put("a", 2);
        listMultimap.putAll("a", ImmutableList.of(1, 2, 3));
        // asMap视图
        Map map = listMultimap.asMap();
        System.out.println("==========asMap=========");
        System.out.println(map);
        // entries
        Collection<Map.Entry> entries = listMultimap.entries();
        System.out.println("==========entries=========");
        System.out.println("entries:" + entries);
        for (Map.Entry entry : entries) {
            System.out.println("key:" + entry.getKey() + "    value:" + entry.getValue());
        }
        // keys
        Multiset keys = listMultimap.keys();
        System.out.println("==========keys=========");
        System.out.println(keys);
        // keySet
        Set set = listMultimap.keySet();
        System.out.println("==========keySet=========");
        System.out.println(set);
    }
}
