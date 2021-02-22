package leetCode.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/2/22 -14:02
 */
public class T49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<String, List<String>>();
            for (String str : strs) {
                char[] array = str.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> list = map.getOrDefault(key, new ArrayList<String>());
                list.add(str);
                map.put(key, list);
            }
            return new ArrayList<List<String>>(map.values());
        }
    }
}
