package leetcodeReview.reviewDP;

/**
 * @author liqiqi_tql
 * @date 2021/4/3 -19:34
 */
public class T1049 {
    public int lastStoneWeightII(int[] stones){
        int len = stones.length;
        int sum=0;
        for (int i=0;i<len;i++){
            sum+=stones[i];
        }
        int target=sum/2;
        int[] dp=new int[target+1];
        for (int i=0;i<len;i++){
            for (int j=target;j>=stones[i];j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-2*dp[target];
    }
}
