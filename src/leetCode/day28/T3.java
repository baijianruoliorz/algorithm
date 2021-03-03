package leetCode.day28;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -15:10
 */
public class T3 {
    public int lengthOfLongestSubstring(String s){
        char[] chars = s.toCharArray();

        int length = chars.length;
        int num=0;
        int res=0;
        while (num<length){
            LinkedList<Character> characterLinkedList=new LinkedList<>();
            for (int i=num;i<length;i++){
                if (!characterLinkedList.contains(chars[i])){
                    characterLinkedList.add(chars[i]);
                }else {
                    break;
                }
            }
            num++;
            res=Math.max(res,characterLinkedList.size());
        }
        return res;
    }
}
