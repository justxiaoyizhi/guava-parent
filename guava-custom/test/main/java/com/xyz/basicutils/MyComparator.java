package main.java.com.xyz.basicutils;

import java.util.Comparator;

/**
 * Created by Xiao on 2016/12/12.
 */
public class MyComparator implements Comparator<String> {

    @Override
    public int compare(java.lang.String o1, java.lang.String o2) {
        return (int)o1.charAt(0) > (int)o2.charAt(0) ? 1 : -1;
    }
}
