package leetCode.day46;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -11:47
 */
public class T402 {
    public String removeKdigits(String num,int k){
        Deque<Character> deque=new LinkedList<>();
        int length = num.length();
        for (int i=0;i<length;i++){
            char digit = num.charAt(i);
            while (!deque.isEmpty()&&k>0&&deque.peekLast()>digit){
                deque.pollLast();
                k--;
            }
            deque.offerLast(digit);
        }
        for (int i=0;i<k;i++){
            deque.pollLast();
        }
        StringBuilder ret=new StringBuilder();
        boolean LendingZero=true;
        while (!deque.isEmpty()){
            Character digit = deque.pollFirst();
            if (LendingZero&&digit=='0'){
                continue;
            }
            LendingZero=false;
            ret.append(digit);
        }
        return ret.length()==0?"0":ret.toString();
    }
}
