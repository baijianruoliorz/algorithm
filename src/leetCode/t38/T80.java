package leetCode.t38;

/**
 * @author liqiqi_tql
 * @date 2021/4/6 -9:07
 */
public class T80 {
    public int removeDuplicates(int[] nums){
        int n=nums.length;
        if (n<=2){
            return n;
        }
        int slow=2,fast=2;
        while (fast<n){
            if (nums[slow-2]!=nums[fast]){
                nums[slow]=nums[fast];
                ++slow;
            }
            fast++;
        }
        return slow;
    }
}
