package leetCode.day47;

/**
 * @author liqiqi_tql
 * @date 2021/4/17 -16:31
 */
public class T81 {
    public boolean search(int[] nums,int target){
        int n = nums.length;
        if (n==0){
            return true;
        }
        if (n==1){
            return nums[0]==target?true:false;
        }
        int l=0,r=n-1;
        while (l<=r){
            int mid=(r-l)/2+l;
            if (nums[mid]==target){
                return true;
            }
            if (nums[0]<=nums[mid]){
                if(nums[0]<=target&&target<nums[mid]){
                    r=mid-1;
                }else {
                    l=mid+1;
                }
            }else {
                if (nums[mid]<target&&target<=nums[n-1]){
                    l=mid+1;
                }else {
                    r=mid-1;
                }
            }
        }
        return false;
    }
}
