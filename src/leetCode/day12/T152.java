package leetCode.day12;

/**
 * @author liqiqi_tql
 * @date 2020/12/26 -10:30
 */
public class T152 {
    public int maxProduct(int[] nums){
        if (nums.length==0) {
            return 0;
        }
        int ans=nums[0];
        int[] maxDP=new int[nums.length];
        int[] minDP=new int[nums.length];
        maxDP[0]=nums[0];
        minDP[0]=nums[0];
        for (int i=1;i<nums.length;i++){
            maxDP[i]=Math.max(nums[i],Math.max(maxDP[i-1]*nums[i],minDP[i-1]*nums[i]));
            minDP[i]=Math.min(nums[i],Math.min(maxDP[i-1]*nums[i],minDP[i-1]*nums[i]));
            ans=Math.max(ans,maxDP[i]);
        }
        return ans;
    }
}
