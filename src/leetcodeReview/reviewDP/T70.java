package leetcodeReview.reviewDP;

/**
 * @author liqiqi_tql
 * @date 2021/3/15 -11:00
 */
public class T70 {
    public int climbStairs(int n){
        if (n<=2){
            return n;
        }
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
