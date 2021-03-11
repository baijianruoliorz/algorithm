package leetcodeReview.review4;

/**
 * @author liqiqi_tql
 * @date 2021/3/11 -10:58
 */
public class T704 {
    public int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(right-left)/2+left;
            if (nums[mid]<target){
                left=mid+1;
            }else if (nums[mid]>target){
                right=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
