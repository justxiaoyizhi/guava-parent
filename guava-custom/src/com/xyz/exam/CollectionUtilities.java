package com.xyz.exam;

import com.google.common.collect.*;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by Xiao on 2017/3/19.
 */
public class CollectionUtilities {

    @Test
    public void testStaticMethod() {
        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
        Set<Integer> set1 = Sets.newHashSet(7, 8, 9);
    }

    @Test
    public void testIterators() {
        Set set1 = Sets.newHashSet(1, 8, 10, 2, 1);
        Set set2 = Sets.newHashSet(4, 9, 10, 3);
        Iterable concat = Iterables.concat(set1, set2);
        System.out.println("===========concat===========");
        System.out.println(concat);

        ArrayListMultimap<String, Integer> map = ArrayListMultimap.create();
        map.put("a", 1);
        map.put("a", 2);
        int frequency = Iterables.frequency(map.keys(), "a");
        System.out.println("============frequency============");
        System.out.println(frequency);

        ImmutableList<Integer> list = ImmutableList.of(1, 2, 3, 4, 5, 6, 7, 8, 0, 2, 3);
        Iterable<List<Integer>> partition = Iterables.partition(list, 4);
        System.out.println("============partition============");
        System.out.println(partition);

        Set set3 = Sets.newHashSet(4, 9, 10, 3);
        System.out.println("============elementsEqual============");
        System.out.println(Iterables.elementsEqual(set2, set3));

        System.out.println("============limit============");
        System.out.println(Iterables.limit(set2, 2));

        System.out.println("============getOnlyElement============");
        System.out.println(Iterables.getOnlyElement(ImmutableList.of(1)));
        System.out.println(Iterables.getOnlyElement(ImmutableList.of(), "a"));
        //System.out.println(Iterables.getOnlyElement(list));
    }

    @Test
    public void testLists() {
        ImmutableList<Integer> list = ImmutableList.of(1, 2, 3, 4, 5);
        List<Integer> reverse = Lists.reverse(list);
        System.out.println("===========reverse===========");
        System.out.println(reverse);

        // 笛卡尔积
        List<List<Integer>> lists = Lists.cartesianProduct(list,list);
        System.out.println("===========cartesianProduct===========");
        System.out.println(lists);
    }

    @Test
    public void testSets() {
        ImmutableSet<Integer> set1 = ImmutableSet.of(1, 2, 3);
        ImmutableSet<Integer> set2 = ImmutableSet.of(3, 4, 5);

        // 差集
        Sets.SetView<Integer> difference = Sets.difference(set1, set2);
        System.out.println("============difference============");
        System.out.println(difference);

        // 并集
        Sets.SetView<Integer> union = Sets.union(set1, set2);
        System.out.println("============union============");
        System.out.println(union);

        // 交集
        Sets.SetView<Integer> intersection = Sets.intersection(set1, set2);
        System.out.println("============intersection===========");
        System.out.println(intersection);
    }

    @Test
    public void testMaps() {
        ImmutableMap<String, Integer> map1 = ImmutableMap.of("a", 1, "b", 2, "c", 3, "d", 4);
        ImmutableMap<String, Integer> map2 = ImmutableMap.of("a", 5, "b", 2, "e", 3, "f", 9);
        MapDifference<String, Integer> difference = Maps.difference(map1, map2);

        System.out.println(difference.entriesInCommon());
        System.out.println(difference.entriesDiffering());
        System.out.println(difference.entriesOnlyOnLeft());
        System.out.println(difference.entriesOnlyOnRight());
    }
}
