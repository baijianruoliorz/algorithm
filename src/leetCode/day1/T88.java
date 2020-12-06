package leetCode.day1;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2020/12/5 -13:35
 */
public class T88 {
public void merge(int[] nums1,int m,int[] nums2,int n){
    System.arraycopy(nums2,0,nums1,m,n);
    Arrays.sort(nums1);
}
}
