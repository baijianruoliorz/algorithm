package leetCode.day45;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -16:01
 */
public class T300 {
    public int lengthOfLIS(int[] nums){
        int len = nums.length;
        if (len==0){
            return 0;
        }
        int[] dp=new int[len];
        Arrays.fill(dp,1);
        for (int i=1;i<len;i++){
            for (int j=0;j<i;j++){
                if (nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        Arrays.sort(dp);
        return dp[len-1];
    }
}
