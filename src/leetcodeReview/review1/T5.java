package leetcodeReview.review1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -11:05
 */
public class T5 {
    class Solution{
        public String longestPalindrome(String s){
            List<String> stringList=new ArrayList<>();
            String endString = null;
            if (s.length()==0){
                return "";
            }

            for (int i=0;i<s.length();i++){
                for (int j=i+1;j<s.length()+1;j++){
                stringList.add(s.substring(i,j));
                }
            }
            int res=0;

            List<String> desList = new ArrayList<>();
            for (String s1 : stringList) {
                if (isValid(s1)) {
                    desList.add(s1);
                }
            }
            for (String s1 : desList) {
                if (s1.length()>res) {
                    endString=s1;
                    res=s1.length();
                }

            }
            return endString;
    }
    public boolean isValid(String s){
            if (s.length()==1){
                return true;
            }
        int i=0,max=s.length();
        char[] chars = s.toCharArray();
        while (i<max){
            if (chars[i]==chars[max-1]){
                i++;
                max--;
            }else {
             return false;
            }
            }
        return true;
        }
    }
}
