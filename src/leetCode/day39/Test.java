package leetCode.day39;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author liqiqi_tql
 * @date 2021/4/9 -0:53
 */
public class Test {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.push(6);
        deque.add(7);
        deque.push(8);
        System.out.println(deque.pop());
    }
}
