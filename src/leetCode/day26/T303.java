package leetCode.day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/3/2 -15:33
 */
public class T303 {
    class NumArray{
        int[] sums;
        public NumArray(int[] nums){
            int n=nums.length;

            sums=new int[n+1];
            for (int i=0;i<n;i++){
                sums[i+1]=sums[i]+nums[i];
            }
        }
        public int sumRange(int i,int j){
            return sums[j+1]-sums[i];
        }
    }
}
