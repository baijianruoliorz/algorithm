package leetCode.day28;

import java.util.LinkedList;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -15:19
 */
public class T3method2 {
    public int lengthOfLongestSubString(String s){
        char[] chars = s.toCharArray();
        LinkedList<Character> characters=new LinkedList<>();
        int length = chars.length;
        int nums=0;
        for (int i=0;i<length;i++){
            if (!characters.contains(chars[i])){
                characters.addLast(chars[i]);
                nums=Math.max(nums,characters.size());
            }else{
                characters.removeFirst();
            }
        }
        return nums;
    }
}
