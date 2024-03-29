package leetCode.day43;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -17:15
 */
public class T16 {
    public int threeSumCloest(int[] nums,int target){
        int length = nums.length;
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<length;i++){
            int start=i+1;
            int end=length-1;
            while (start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if (Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }
                if (sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }else {
                    return ans;
                }
            }
        }
        return ans;
    }
}
