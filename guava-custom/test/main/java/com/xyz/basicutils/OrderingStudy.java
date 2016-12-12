package main.java.com.xyz.basicutils;

import com.google.common.collect.Ordering;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Xiao on 2016/12/11.
 */
public class OrderingStudy {

    @Test
    public void testAllEqualOrdering() {
        String s[] = {null,"a","n","c",null};
        // Ordering.allEqual() 全都一样大，即按照顺序
        for (String s1 : Ordering.allEqual().nullsFirst().sortedCopy(Arrays.asList(s))) {
            System.out.println(s1);
        }
    }

    @Test
    public void testArbitraryOrdering() {
        String s[] = {null,"a","b","n","c",null};
        // Ordering.arbitrary() 随意的，武断的，即任意排序
        for (String s1 : Ordering.arbitrary().nullsFirst().sortedCopy(Arrays.asList(s))) {
            System.out.println(s1);
        }
    }

    @Test
    public void testExplicitOrdering() {
        String s[] = {"a","b","n","e","c"};
        // Ordering.explicit 清楚的，显然的，即原始排序
        for (String s1 : Ordering.explicit(Arrays.asList(s)).sortedCopy(Arrays.asList(s))) {
            System.out.println(s1);
        }

    }

    @Test
    public void testComparatorOrdering() {
        String s[] = {"a","b","n","e","c"};
        try {
            // 自定义比较器放入排序器中
            for (String s1 : Ordering.from(MyComparator.class.newInstance()).sortedCopy(Arrays.asList(s))) {
                System.out.println(s1);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testNaturalOrdering() {
        String s[] = {"aad","adb","dna","aed","vcd"};
        Integer a[] = {1,42,34,45,126};
        for (String s1 : Ordering.natural().sortedCopy(Arrays.asList(s))) {
            System.out.println(s1);
        }
        for (Integer integer : Ordering.natural().sortedCopy(Arrays.asList(a))) {
            System.out.println(integer);
        }
    }

    @Test
    public void testStringOrdering() {
        String s[] = {"aad","adb","dna","aed","vcd"};
        for (String s1 : Ordering.usingToString().sortedCopy(Arrays.asList(s))) {
            System.out.println(s1);
        }

    }
}
