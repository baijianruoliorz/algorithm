package leetcodeReview.reviewDP;

/**
 * @author liqiqi_tql
 * @date 2021/3/15 -11:12
 */
public class T198 {
    class Solution{
        public int rob(int[] nums){
            if (nums.length==0){
                return 0;
            }

            int[] dp=new int[nums.length+1];
            dp[0]=0;
            dp[1]=nums[0];
            for (int i=2;i<=nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
            }
            return dp[nums.length];
        }
    }
}
