package leetCode.day45;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -10:41
 */
public class T213 {
    public int rob(int[] nums){
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return nums[0];
        }
        int length = nums.length;
        int[] nums2=new int[length];
        System.arraycopy(nums,1,nums2,0,length-1);
        return Math.max(dpRob(nums,0,length-1),dpRob(nums2,0,length-1));
    }

    private int dpRob(int[] nums, int start, int end) {
        int[] dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for (int i=2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-1]+nums[2-1]);
        }
        return dp[end];
    }
}
