package leetCode.day40;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -14:53
 */
public class T55 {
    public boolean canJump(int[] nums){
        int n = nums.length;
        int rightnmost=0;
        for (int i=0;i<n;i++){
            if (i<=rightnmost){
                rightnmost=Math.max(rightnmost,i+nums[i]);
                if (rightnmost>=n-1){
                    return true;
                }
            }
        }
        return false;
    }
}
