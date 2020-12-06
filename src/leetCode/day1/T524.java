package leetCode.day1;

import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/12/5 -14:21
 */
public class T524 {

        public boolean isSubsequence(String x, String y) {
            int j = 0;
            for (int i = 0; i < y.length() && j < x.length(); i++) {
                if (x.charAt(j) == y.charAt(i)) {
                    j++;
                }
            }
            return j == x.length();
        }
        public String findLongestWord(String s, List < String > d) {
            String max_str = "";
            for (String str: d) {
                if (isSubsequence(str, s)) {
                    if (str.length() > max_str.length() || (str.length() == max_str.length() && str.compareTo(max_str) < 0)) {
                        max_str = str;
                    }
                }
            }
            return max_str;
        }


}
