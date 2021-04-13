package leetCode.day42;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -20:01
 */
public class T70 {
    public int climbStairs(int n){
        int[] dp=new int[n+1];
        if(n<=2){
            return n;
        }
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
