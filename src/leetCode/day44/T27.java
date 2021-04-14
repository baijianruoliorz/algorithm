package leetCode.day44;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -21:10
 */
public class T27 {
    public int removeElement(int[] nums,int val){
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
