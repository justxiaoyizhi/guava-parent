package main.java.com.xyz.basicutils;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import org.junit.Test;

/**
 * Created by Xiao on 2016/12/19.
 */
public class MultiCollectionStudy {

    @Test
    public void testMultiCollection() {
        Multiset set = HashMultiset.create();
        set.add(2);
        set.add("adjl");
        set.add(2);
        set.add("adjl");
        System.out.println(set.count(2));
        for (Object o : set.entrySet()) {
            System.out.println(((Multiset.Entry)o).getElement());
        }
        set.add(2,4);
        set.setCount(2,6,3);

        System.out.println(set.toString());

    }
}
