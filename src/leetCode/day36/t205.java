package leetCode.day36;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/3/21 -14:08
 */
public class t205 {
    public boolean isIsomorphic(String s,String t) {
        Map<Character, Character> s2t = new HashMap<>();
        Map<Character, Character> t2s = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }
        return true;
    }
}
