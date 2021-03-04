package leetCode.day29;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/3/4 -9:22
 */
public class T300 {
    public int lengthOfLIS(int[] nums){
        int length = nums.length;
        if (length==0){
            return 0;
        }
        int[] dp=new int[length];
        Arrays.fill(dp,1);
        for (int i=1;i<length;i++){
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        Arrays.sort(dp);
        return dp[length-1];
    }
}
