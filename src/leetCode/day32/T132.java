package leetCode.day32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/8 -9:19
 */
public class T132 {
    public int minCut(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        if (s.length()==1){
            return 0;
        }
        if (check(s,0,s.length()-1)){
            return 0;
        }
        List<List<String>> res = new ArrayList<>();
        LinkedList<String> stack = new LinkedList<>();
        backtracking(s, 0, stack, res, length);
        int min = Integer.MAX_VALUE;
        for (List<String> re : res) {
            if (min > re.size()) {
                min = re.size();
            }
        }
        min--;
        return min;

    }

    private void backtracking(String s, int start, LinkedList<String> stack, List<List<String>> res, int length) {

        if (start == length) {
            if (stack.size()==1){
                return;
            }
            res.add(new ArrayList<>(stack));
            return;
        }
        for (int i = start; i < length; i++) {
            if (!check(s, start, i)) {
                continue;
            }
            stack.addLast(s.substring(start, i + 1));
            backtracking(s, i + 1, stack, res, length);
            stack.removeLast();
        }
    }

    private boolean check(String s, int start, int i) {
        while (start < i) {
            if (s.charAt(start) != s.charAt(i)) {
                return false;
            }
            start++;
            i--;
        }
        return true;
    }
}



