package leetCode.day8;

/**
 * @author liqiqi_tql
 * @date 2020/12/23 -8:53
 */
public class T198 {
    public int rob(int[] nums){
        int pre2=0,pre1=0;;
        for (int i=0;i<nums.length;i++){
            int cur=Math.max(pre2+nums[i],pre1);
            pre2=pre1;
            pre1=cur;
        }
        return pre1;
    }
}
