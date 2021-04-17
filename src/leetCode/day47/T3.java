package leetCode.day47;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/17 -19:39
 */
public class T3 {
    public int lengthOfLongestSubstring(String s){
        List<Character> list=new ArrayList<>();
        char[] chars = s.toCharArray();
        int max=0;
        for (int i=0;i<chars.length;i++){
            if (!list.contains(chars[i])){
                list.add(chars[i]);
            }else {
                list.remove(0);
                i--;
            }
            max=Math.max(max,list.size());
        }
        return max;
    }
}
