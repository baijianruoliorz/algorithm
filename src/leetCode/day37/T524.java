package leetCode.day37;

import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/1 -9:13
 */
public class T524 {
    public boolean isSubsequence(String x,String y){
        int j=0;
        for (int i=0;i<x.length();i++){
            if (x.charAt(i)==y.charAt(j)){
                j++;
            }
        }
        return j==y.length();
    }
    public String findLongestWord(String s, List<String> d){
        String max_str="";
        for (String s1 : d) {
            if (isSubsequence(s,s1)){
            if (s1.length()>max_str.length()||(s1.length()==max_str.length())&&s1.compareTo(max_str)<0){
                max_str=s1;
            }
            }
        }
        return max_str;
    }
}
