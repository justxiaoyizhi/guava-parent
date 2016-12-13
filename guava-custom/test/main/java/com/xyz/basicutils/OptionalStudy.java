package main.java.com.xyz.basicutils;


import com.google.common.base.Optional;
import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Xiao on 2016/12/8.
 */
@Slf4j
public class OptionalStudy {

    @Test
    public void mapValueNull() {
        Map<String,Object> map = new HashMap<>();
        map.put("name","null");

        Assert.assertEquals("null",map.get("name"));
        Assert.assertNull(map.get("123"));

        log.debug("这个key为name的值是:{}",map.get("name"));
        log.debug("这个key为123的值是{}",map.get("123"));
    }

    @Test
    public void testOptional() {
        String name = "123";
        Optional.fromNullable(name).or("hello");
    }
}
