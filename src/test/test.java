package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -22:28
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        List b=a;
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
