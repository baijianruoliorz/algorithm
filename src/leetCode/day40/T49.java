package leetCode.day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -20:14
 */
public class T49 {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);
            List<String> list = map.getOrDefault(s, new ArrayList<>());
            list.add(str);
            map.put(s,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
