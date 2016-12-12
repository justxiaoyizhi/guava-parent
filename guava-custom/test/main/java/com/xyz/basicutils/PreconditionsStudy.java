package main.java.com.xyz.basicutils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static com.google.common.base.Preconditions.*;

/**
 * Created by Xiao on 2016/12/10.
 */
@Slf4j
public class PreconditionsStudy {

    @Test
    public void testPreconditions() {
        checkArgument(true,"%s是%s","1","2",3,4);
        System.out.println(111);
        Person name = new Person("123");
        try {
            checkNotNull(name,"%s是%s","1","2",3,4,5,6,7,8,9);
        } catch (Exception e) {
            log.debug("cuole",e);
        }
        checkElementIndex(0,new String[]{"1","2"}.length);
        checkPositionIndex(0,new String[]{"1","2"}.length);
        checkState(true);
        checkPositionIndexes(3,2,3);
    }
}
