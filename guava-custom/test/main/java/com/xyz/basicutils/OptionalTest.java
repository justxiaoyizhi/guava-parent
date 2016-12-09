package main.java.com.xyz.basicutils;

import com.google.common.base.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Xiao on 2016/12/9.
 */
public class OptionalTest {

    public static void main(String[] args) {
        // 使用场景
        Optional<Person> p = Person.find("zhangsan");
        p.or(new Person("mananger")).doSomething();
        if(p.isPresent()) {
            p.get().doSomething();
        }
    }
}

@Getter
@AllArgsConstructor
class Person {
    private String name;
    public static Optional<Person> find(String name) {
        if(name.equals("zhangsan")) {
            return Optional.of(new Person("zhangsan"));
        }
        return Optional.absent();
    }

    public void doSomething() {
        System.out.println("做了一些事");
    }
}
