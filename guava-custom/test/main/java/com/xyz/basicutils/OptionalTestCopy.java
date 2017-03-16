package main.java.com.xyz.basicutils;

import com.google.common.base.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Xiao on 2016/12/9.
 */
public class OptionalTestCopy {

    public static void main(String[] args) {
        // 使用场景
        NormalPerson p = NormalPerson.find("zhangsan");
        p.doSomething();
        Optional.fromNullable(p).or(new NormalPerson("manager")).doSomething();
    }
}

@Getter
@AllArgsConstructor
class NormalPerson {
    private String name;
    public static NormalPerson find(String name) {
        if("zhangsan".equals(name)) {
            return new NormalPerson("zhangsan");
        }
        return null;
    }

    public void doSomething() {
        System.out.println(name+"做了一些事");
    }
}