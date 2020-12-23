package leetCode.day8;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2020/12/23 -9:13
 */
public class T62 {
    public int uniquePaths(int m,int n){
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[j]=dp[j]+dp[j-1];
            }
        }
        return dp[n-1];
    }
}
