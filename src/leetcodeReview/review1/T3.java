package leetcodeReview.review1;

import java.util.LinkedList;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -10:34
 */
public class T3 {
    public int lengthOfLongestSubString(String s){
        if (s==null){
            return 0;
        }
        char[] chars = s.toCharArray();
        LinkedList<Character> linkedList=new LinkedList<>();
        int length = chars.length;
        int maxLength=0;
        if (length==0){
            return 0;
        }
        for (int i=0;i<length;i++){
            if (!linkedList.contains(chars[i])){
                linkedList.add(chars[i]);
                maxLength=Math.max(maxLength,linkedList.size());
            }else {

                linkedList.add(chars[i]);
                i--;
            }
        }
        return maxLength;

    }
}
