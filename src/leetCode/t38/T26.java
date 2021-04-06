package leetCode.t38;

/**
 * @author liqiqi_tql
 * @date 2021/4/6 -9:17
 */
public class T26 {
    public int removeNums(int[] nums){
        int length = nums.length;
        if (length==0||nums==null){
            return 0;
        }
        int p=0,q=1;
        while (q<length){
            if (nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
