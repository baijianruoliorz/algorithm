package leetCode.day45;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -15:24
 */
public class T268 {
    class Solution {
        public int missingNumber(int[] nums){
            Arrays.sort(nums);
            for(int i=0;i<nums.length;i++){
                if (i!=nums[i]){
                    return i;
                }
                if(i==nums.length-1){
                    return i+1;
                }
            }
            return -1;
        }
    }
}
