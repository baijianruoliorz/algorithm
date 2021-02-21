package leetCode.day21;

/**
 * @author liqiqi_tql
 * @date 2021/2/21 -12:05
 */
public class T32 {
    class Solution {
        public int longestValidParentheses(String s) {
            int n = s.length();
            int[] dp = new int[n];//dp是以i处括号结尾的有效括号长度
            int max_len = 0;
            //i从1开始，一个是单括号无效，另一个是防i - 1索引越界
            for(int i = 1; i < n; i++) {
                if(s.charAt(i) == ')') { //遇见右括号才开始判断
                    if(s.charAt(i - 1) == '(') { //上一个是左括号
                        if(i < 2) { //开头处
                            dp[i] = 2;
                        } else { //非开头处
                            dp[i] = dp[i - 2] + 2;
                        }
                    }
                    else { //上一个也是右括号
                        if(dp[i - 1] > 0) {//上一个括号是有效括号
//pre_left为i处右括号对应左括号下标，推导：(i-1)-dp[i-1]+1 - 1
                            int pre_left = i - dp[i - 1] - 1;
                            if(pre_left >= 0 && s.charAt(pre_left) == '(') {//左括号存在且为左括号（滑稽）
                                dp[i] = dp[i - 1] + 2;
                                //左括号前还可能存在有效括号
                                if(pre_left - 1 > 0) {
                                    dp[i] = dp[i] + dp[pre_left - 1];
                                }
                            }
                        }
                    }
                }
                max_len = Math.max(max_len, dp[i]);
            }
            return max_len;
        }
    }
}
