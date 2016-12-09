package main.java.com.xyz.basicutils;


import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Xiao on 2016/12/8.
 */
@Slf4j
public class MapNull {

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
    public void testOptional(){
        String str = null;
        Optional.of(str);
    }
}
