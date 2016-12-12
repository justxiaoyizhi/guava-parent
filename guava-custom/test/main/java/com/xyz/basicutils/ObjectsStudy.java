package main.java.com.xyz.basicutils;

import com.google.common.base.Objects;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Xiao on 2016/12/13.
 */
public class ObjectsStudy {

    @Test
    public void test() {
        String str = null;
        int i = 0;
        Assert.assertFalse(Objects.equal(str,i));
    }
}
