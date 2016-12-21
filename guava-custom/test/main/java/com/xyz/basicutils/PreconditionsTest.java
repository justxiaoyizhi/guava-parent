package main.java.com.xyz.basicutils;


/**
 * 前置条件判断的用处
 *
 * @author xiao
 * @create 2016-12-20 13:40
 **/
public class PreconditionsTest {
    public static void main(String[] args) {
        String s = null;
        PreconditionsTest pt = new PreconditionsTest();
        pt.getStringLength(s);
    }

    private int getStringLength(String s) {
        return s.length();
    }
}

/*class Foo {
    private final String s;

    public Foo(String s) {
        this.s = s;
    }

    public int getStringLength() {
        return s.length();
    }
}*/
