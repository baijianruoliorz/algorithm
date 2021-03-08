package leetcodeReview.review2;

/**
 * @author liqiqi_tql
 * @date 2021/3/8 -14:22
 */
public class T11 {
    public int maxArea(int[] height){
      int i=0,length=height.length-1,res=0;
      while (i<length){
       res=height[i]<height[length]?Math.max(res,(length-i)*height[i++]):Math.max(res,(length-i)*height[length--]);
      }
      return res;
    }
}
