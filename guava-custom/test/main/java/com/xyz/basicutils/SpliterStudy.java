package main.java.com.xyz.basicutils;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;
import java.util.Map;

/**
 * Created by Xiao on 2016/12/20.
 */
public class SpliterStudy {

    @Test
    public void testSpliterOne() {
        String str = ",a,,b,";
        String[] split = str.split(",");
        // 1. "", "a", "", "b", ""
        // 2. "a","", "b"
        // 3. "", "a", "", "b"
        // 4. "a","","b",""
        for (String s : split) {
            System.out.print("--"+s);
        }

        System.out.println();
        HashSet<String> set = Sets.newHashSet(str.split(","));
        for (String s : set) {
            System.out.print("--"+s);
        }

    }

    @Test
    public void testSpliterTwo() {
        Map<String, String> split = Splitter.on("&").withKeyValueSeparator("=").split("id=3&name=zhangsan");
        for (Map.Entry<String, String> entry : split.entrySet()) {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        Iterable<String> str = Splitter.fixedLength(3).limit(3).split("a,b,c,d,e,f,g");
        for (String s : str) {
            System.out.println(s);
        }


    }


    @Test
    public void testSpliterThree() {
        String join = Joiner.on("&").withKeyValueSeparator("=").join(ImmutableMap.of("id", "3", "name", "zhangsan"));
        System.out.println(join);
    }
}
