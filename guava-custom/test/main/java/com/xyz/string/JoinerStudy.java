package main.java.com.xyz.string;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Arrays;
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
        List attrList = Lists.newArrayList("a","b","","d");
        StringBuffer attrs = new StringBuffer();
        for(int i=0;i<attrList.size();i++){
            if(StringUtils.hasText(attrList.get(i).toString())){
                if(i == attrList.size()-1){
                    attrs.append(attrList.get(i).toString());
                }else{
                    attrs.append(attrList.get(i).toString() + ",");
                }
            }
        }
        System.out.println(attrs.toString());
        String join = Joiner.on(",").skipNulls().join(attrList);
        String s = CharMatcher.whitespace().removeFrom(join);
        System.out.println(s);

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
