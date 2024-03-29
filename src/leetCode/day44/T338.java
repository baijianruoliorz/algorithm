package leetCode.day44;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -23:13
 */
public class T338 {
    public int[] countBits(int num){
        int[] nums=new int[num+1];
        nums[0]=0;
        for (int i=1;i<num+1;i++){
            nums[i]=(i%2==1)?(nums[i-1]+1):nums[i/2];
        }
        return nums;
    }
}
