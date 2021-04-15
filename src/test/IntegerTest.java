package test;

import javax.sound.midi.Soundbank;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -14:21
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a=new Integer(200);
        int b=200;
        Integer c=200;
        Integer d=200;
        Integer e=-128;
        Integer f=-128;
        System.out.println("sadas");
//          true  -128~127之间都是true
        System.out.println(e==f);
        System.out.println(a.equals(b));
        System.out.println(a==b);
//        false
        System.out.println(a==c);
//        true
        System.out.println(c.equals(d));
    }
}
