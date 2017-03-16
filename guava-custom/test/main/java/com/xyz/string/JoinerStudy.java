package main.java.com.xyz.string;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import main.java.com.xyz.util.CodeTimer;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 学习Joiner
 *
 * @author xiao
 * @create 2016-12-20 18:42
 **/
public class JoinerStudy {

    @Test
    public void testJoinOne() {
        StringBuffer sb = new StringBuffer();
        sb.append("s123");
        System.out.println(Arrays.asList(1,5,9).toString());
        String join = Joiner.on(",").join(Arrays.asList(1, 5, 9));
        System.out.println(join);
        try {
            StringBuffer buffer = Joiner.on(",").appendTo(sb, Arrays.asList("2", "3"));
            System.out.println(buffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = Joiner.on(",").join(new Person[]{new Person("zhangsan", 4), new Person("lisi", 5)});
        System.out.println(s);
    }

    @Test
    public void testJoinTwo() {
        int j = 0;
        while(j<10) {
            j++;
            List attrList = Lists.newArrayList("a", "b", null, "d");
            long start = CodeTimer.start();
            StringBuffer attrs = new StringBuffer();
            for (int i = 0; i < attrList.size(); i++) {
                if (attrList.get(i) == null) {
                    if (i == attrList.size() - 1) {
                        attrs.append(attrList.get(i).toString());
                    } else {
                        attrs.append(attrList.get(i).toString());
                        attrs.append(",");
                    }
                }
            }
            System.out.println(attrs.toString());
            CodeTimer.store("first", start);
            CodeTimer.printAll();
        }
    }

    @Test
    public void testJoinThree() {
        int i = 0;
        while(i<10) {
            i++;
            List attrList = Lists.newArrayList("a","b","","d");
            long start1 = CodeTimer.start();
            StringBuffer attrs = new StringBuffer();
            Iterator iterator = attrList.iterator();
            while(iterator.hasNext()) {
                Object next = iterator.next();
                if(StringUtils.hasText(next.toString())) {
                    attrs.append(next.toString());
                }
                break;
            }
            while(iterator.hasNext()) {
                Object next = iterator.next();
                if(StringUtils.hasText(next.toString())) {
                    attrs.append(",");
                    attrs.append(next.toString());
                }
            }
            System.out.println(attrs.toString());
            CodeTimer.store("second",start1);
            CodeTimer.printAll();
        }

    }
}

@Setter
@Getter
@AllArgsConstructor
class Person {
    private String name;
    private int id;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
