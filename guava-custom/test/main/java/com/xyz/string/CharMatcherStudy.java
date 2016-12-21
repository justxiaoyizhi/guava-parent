package main.java.com.xyz.string;

import com.google.common.base.CharMatcher;
import org.junit.Test;

/**
 * 字符匹配用法
 *
 * @author xiao
 * @create 2016-12-21 9:19
 **/
public class CharMatcherStudy {

    @Test
    public void testCharMatcherOne() {
        String s = CharMatcher.anyOf(" ").collapseFrom("    mmmm",'a');
        System.out.println(s);
    }

    @Test
    public void testCharMatcherTwo() {
        String s = CharMatcher.ascii().removeFrom("你");
        System.out.println(s);

        String s1 = CharMatcher.breakingWhitespace().removeFrom("   &nbsp;  aaa   b  bb");
        System.out.println(s1);
        // 数字
        String s2 = CharMatcher.digit().removeFrom("aaa1   2b3  wef010");
        System.out.println(s2);

        String s3 = CharMatcher.inRange('1', 'q').removeFrom("2 45 uamnk xw");
        System.out.println(s3);

        String s4 = CharMatcher.invisible().removeFrom("aa bb oas \ndjf52 413");
        System.out.println(s4);

        String s5 = CharMatcher.is('a').removeFrom("abacaedfsc");
        System.out.println(s5);

        String s6 = CharMatcher.isNot('b').removeFrom("cvxabbadbsafdb");
        System.out.println(s6);

        String s7 = CharMatcher.none().removeFrom("cvxabba !@($+_Odbsafdb");
        System.out.println(s7);

        String s8 = CharMatcher.whitespace().removeFrom("v      &nbsp; sfda     \n aadasd");
        System.out.println(s8);

        String s9 = CharMatcher.noneOf("afsd").removeFrom("afdsfaasopuodf");
        System.out.println(s9);

        String s10 = CharMatcher.singleWidth().removeFrom("s");
        System.out.println(s10);
    }

    @Test
    public void testCharMatcherThree() {
        int b = 0;

        int i = CharMatcher.anyOf("a").countIn("adadsffasdbjkl");
        System.out.println(i);

        String s = CharMatcher.anyOf("a").collapseFrom("aadjak", 'b');
        System.out.println(s);

        int i1 = CharMatcher.anyOf("a").indexIn("addafsda",2);
        System.out.println(i1);

        int i2 = CharMatcher.anyOf("a").lastIndexIn("adsafsda");
        System.out.println(i2);

        System.out.println(CharMatcher.anyOf("ad").matches('b'));

        System.out.println(CharMatcher.anyOf("ad").matchesAnyOf("af"));

        CharMatcher.anyOf("ad");
    }

}
