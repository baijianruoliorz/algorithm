package leetCode.day39;

/**
 * @author liqiqi_tql
 * @date 2021/4/8 -20:36
 */
public class T456 {
    public boolean find132pattern(int[] nums){
        int length=nums.length;
        if (length<3){
            return false;
        }
        int left=nums[0];
        for (int i=1;i<length-1;i++){
            if (nums[i]>left){
                for (int j=i+1;j<length;j++){
                    if ((nums[j]>left&&nums[j]<nums[i])){
                        return true;
                    }
                }
            }
            left=Math.min(left,nums[i]);
        }
        return false;
    }
}
