package leetCode.day27;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -14:15
 */
public class T122 {
    class Solution {
        int res ;

        public int maxProfit(int[] prices) {
            int n = prices.length;
            if (n < 2) {
                return 0;
            }
            dfs(prices, 0, 0, n, res);
            return res;
        }

        public void dfs(int[] prices, int status, int begin, int size, int profit) {
            if (begin == size - 1) {
                res = Math.max(res, profit);
                return;
            }
            dfs(prices,status,begin+1,size,res);
            if (status == 0) {
                dfs(prices, 1, size, begin + 1, res - prices[begin]);
            }
            if (status == 1) {
                dfs(prices, 0, size, begin + 1, res + prices[begin]);
            }
        }
    }
}
