package leetcodeReview.reviewDP;

import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/4 -20:52
 */
public class T120 {
    class Solution {
        public int minimumTotal(List<List<Integer>> tri) {
            int n = tri.size();
            int ans = Integer.MAX_VALUE;
            int[][] f = new int[n][n];
            f[0][0] = tri.get(0).get(0);
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    int val = tri.get(i).get(j);
                    f[i][j] = Integer.MAX_VALUE;
                    if (j != 0) f[i][j] = Math.min(f[i][j], f[i - 1][j - 1] + val);
                    if (j != i) f[i][j] = Math.min(f[i][j], f[i - 1][j] + val);
                }
            }
            for (int i = 0; i < n; i++) ans = Math.min(ans, f[n - 1][i]);
            return ans;
        }
    }
}
