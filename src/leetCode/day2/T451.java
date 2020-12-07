package leetCode.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2020/12/6 -22:14
 */
public class T451 {

    public String frequencySort(String s){
        Map<Character,Integer> frequencyForNum=new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyForNum.put(c,frequencyForNum.getOrDefault(c,0)+1);
        }

        List<Character>[] frequencyBucket = new ArrayList[s.length()+1];
        for (Character c : frequencyForNum.keySet()) {
            int f=frequencyForNum.get(c);
            if (frequencyBucket[f]==null){
                frequencyBucket[f]=new ArrayList<>();
            }
            frequencyBucket[f].add(c);
        }
        StringBuilder str=new StringBuilder();
        for (int i=frequencyBucket.length-1;i>=0;i--){
            if (frequencyBucket[i]==null){
                continue;
            }
            for (Character c : frequencyBucket[i]) {
                for (int j=0;j<i;j++){
                    str.append(c);
                }
            }
        }
        return str.toString();
    }

}
