package leetCode.day32;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/7 -9:57
 */
public class T131 {
    class Solution{
        public List<List<String>> partition(String s){
            int length = s.length();
            List<List<String>> res=new ArrayList<>();
         if (length==0){
             return res;
         }
         Deque<String> stack=new ArrayDeque<>();
         backtracking(s,0,length,stack,res);
         return res;
        }

        private void backtracking(String s, int start, int length, Deque<String> stack, List<List<String>> res) {
            if (start==length){
                res.add(new ArrayList<>(stack));
                return;
            }
            for (int i=start;i<length;i++){
                if (!checkPalindrome(s,start,i)){
                    continue;
                }
                stack.addLast(s.substring(start,i+1));
                backtracking(s,i+1,length,stack,res);
                stack.removeLast();

            }
        }

        private boolean checkPalindrome(String str, int left, int right) {
            while (left<right){
                if (str.charAt(left)!=str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

}
