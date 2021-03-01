package leetCode.day25;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/1 -19:51
 */
public class T71 {
    class Solution {
        public String simplifyPath(String path) {
            if (path == null || path.length() == 0) {
                return "/";
            }
            int len = path.length();
            List<String> names = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if (path.charAt(i) != '/') {
                    int j = i;
                    while (j < len && path.charAt(j) != '/') {
                        j++;
                    }
                    names.add(path.substring(i, j));
                    i = j;
                }
            }
            List<String> res = new ArrayList<>();
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).equals("..")) {
                    if (res.size() > 0) {
                        res.remove(res.size() - 1);
                    } else if (!names.get(i).equals(".")) {
                        res.add(names.get(i));
                    }
                }

            }
            return "/" + String.join("/", res);
        }
    }
}
