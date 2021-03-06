package leetcodeReview.review1;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -10:53
 */
public class T4 {
    public double findMedianSortedArrays(int[] nums1,int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        System.arraycopy(nums1,0,nums,0,m);
        System.arraycopy(nums2,0,nums,m,n);
        Arrays.sort(nums);
        int s=m+n;
//        如果是奇数
        if ((s&1)==1){
            return (nums[(s-1)/2])/1.0;
        }else {
            return (nums[s/2]+nums[s/2-1])/2.0;
        }
    }
}
