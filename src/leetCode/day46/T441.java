package leetCode.day46;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -11:23
 */
public class T441 {
    class Solution {
        public int arrangeCoins(int n) {
            long k = 1, sum = 1;
            while (sum <= n) {
                k++;
                sum = (1 + k) * k / 2;
            }
            return (int) k - 1;
        }
    }



}
