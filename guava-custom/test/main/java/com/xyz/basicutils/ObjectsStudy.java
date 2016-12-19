package main.java.com.xyz.basicutils;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import org.junit.Test;


/**
 * Created by Xiao on 2016/12/13.
 */
public class ObjectsStudy {

    @Test
    public void test() {
        String name = null;
        System.out.println(Objects.equal(name,"abc"));
        System.out.println(MoreObjects.toStringHelper(this).addValue(1).toString());
        String str = MoreObjects.toStringHelper(NormalPerson.class).add("name", "zhangsan").addValue(true).toString();
        System.out.println(str);
    }
}
