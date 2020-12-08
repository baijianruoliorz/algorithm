package leetCode.day3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -11:34
 */
public class T763 {
    public List<Integer> partitionLabels(String S){
        int[] lastIndexsOfChar=new int[26];
        for (int i=0;i<S.length();i++){
            lastIndexsOfChar[char2Index(S.charAt(i))]=i;
        }
        List<Integer> partitions=new ArrayList<>();
        int firstIndex=0;
        while (firstIndex< S.length()){
            int lastIndex=firstIndex;
            for (int i=firstIndex;i< S.length()&&i<=lastIndex;i++){
                int index=lastIndexsOfChar[char2Index(S.charAt(i))];
                if (index>lastIndex){
                    lastIndex=index;
                }
            }
            partitions.add(lastIndex-firstIndex+1);
            firstIndex=lastIndex+1;
        }
        return partitions;
    }
    private int char2Index(char c) {
        return c - 'a';
    }
}


