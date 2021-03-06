package leetCode.day31;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -8:57
 */
public class T503 {
    public int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        if (length==1){
            return new int[]{-1};
        }
        if (length==0){
            return new int[]{};
        }
        int[] ints = Arrays.copyOf(nums, length);
        Arrays.sort(ints);
        int[] res=new int[length];
        int max=ints[length-1];
       for (int i=0;i<length;i++){
           for (int j=i+1;j<=length;j++){
               if (j==length){
                   for (j=0;j<i;j++){
                       if (nums[i]<nums[j]){
                           res[i]=nums[j];
                           break;
                       }else {
                           continue;
                       }
                   }
               }
               if (nums[i]<nums[j]){
                   res[i]=nums[j];
                   break;
               }
               if (nums[i]==max){
                   res[i]=-1;
                   break;
               }
           }
           }
       return res;
       }

}
