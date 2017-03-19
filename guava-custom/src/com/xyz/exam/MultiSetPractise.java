package com.xyz.exam;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Xiao on 2017/3/19.
 */
public class MultiSetPractise {

    @Test
    public void testCountWords() {
        String[] words = new String[]{"as", "ad", "ab", "ag", "as", "ad", "as"};
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            Integer count = counts.get(word);
            if (count == null) {
                counts.put(word, 1);
            } else {
                counts.put(word, count + 1);
            }
        }
    }

    @Test
    public void testMultiSetAdd() {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("qb");
        multiset.add("qb");
        multiset.add("qa");
        multiset.add("qd");
        multiset.add("qe");
        multiset.add("qa");
        int count = multiset.count("qa");
        // count()
        System.out.println("============count============");
        System.out.println("count(qa):" + count);

        // size()
        System.out.println("============size============");
        System.out.println("size:" + multiset.size());

        // iter()
        System.out.println("============iter============");
        for (Iterator<String> it = multiset.iterator(); it.hasNext(); ) {
            String next = it.next();
            System.out.println("element:" + next);
        }

        // foriter()
        System.out.println("============foriter============");
        for (String s : multiset) {
            System.out.println("element:" + s);
        }

        // entrySet()
        System.out.println("============entrySet============");
        for (Multiset.Entry entry : multiset.entrySet()) {
            System.out.println("element:" + entry.getElement() + "    count:" + entry.getCount());
        }

        // elementSet()
        System.out.println("============foriter============");
        for (String s : multiset.elementSet()) {
            System.out.println("element:" + s);
        }
    }

    @Test
    public void testMultiSetIter() {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("qb");
        multiset.add("qb");
        multiset.add("qa");
        multiset.add("qd");
        multiset.add("qe");
        multiset.add("qa");
        for (Iterator<String> it = multiset.iterator(); it.hasNext(); ) {
            String next = it.next();
            System.out.println(next);
        }
        // 计算Multiset的总个数
        System.out.println("Multiset size:" + multiset.size());
        // 计算Multiset
        multiset.elementSet();
    }

    @Test
    public void testHashMapIter() {
        Map<String, Integer> map = new HashMap<>();
        map.put("qb", 1);
        map.put("qa", 2);
        map.put("qd", 4);
        map.put("qe", 6);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
