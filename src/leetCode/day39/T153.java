package leetCode.day39;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/8 -16:28
 */
public class T153 {
    public int findMin(int[] nums){
        Arrays.sort(nums);
        return nums[0];
    }
}
