package leetcodeReview.review1;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -14:27
 */
public class T70 {
    public int climbStairs(int n){
        if (n<2){
            return n;
        }
      int[] dp=new int[n+1];
      dp[0]=0;
      dp[1]=1;
      dp[2]=2;
      for (int i=3;i<=n;i++){
          dp[i]=dp[i-2]+dp[i-1];
      }
      return dp[n];
    }
}
