package main.java.com.xyz.basicutils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import org.junit.Test;

import java.util.*;

/**
 * Created by Xiao on 2016/12/13.
 */
public class ImmutableStudy {


    @Test
    public void testImmutable() {
        ImmutableList list = ImmutableList.builder().add("a").build();
        System.out.println(list.size());
        ImmutableSortedSet set = ImmutableSortedSet.of("a","b","d","c","a","c","b");
        System.out.println(ImmutableSet.copyOf(list).toString());
        set.asList().get(1);
        System.out.println(set.toString());
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(null);
        list.add(null);
        System.out.println(list.size());

        Set set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.size());

        Map map = new HashMap<>();
        map.put(null,"q");
        map.put("q",null);
        map.put(null,null);
        System.out.println(map.get(null));
        System.out.println(map.size());
    }
}
