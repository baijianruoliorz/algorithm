package leetCode.day3;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -11:01
 */

public class T665 {

  public boolean checkPossibility(int[] nums){
      int cnt=0;
      for (int i=1;i<nums.length&&cnt<2;i++){
          if (nums[i]>=nums[i-1]) {
              continue;
          }
          cnt++;
          if (i-2>=0&&nums[i-2]>nums[i]){
              nums[i]=nums[i-1];
          }else {
              nums[i-1]=nums[i];
          }
      }
      return cnt<=1;
  }
}
