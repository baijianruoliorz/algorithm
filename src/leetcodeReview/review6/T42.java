package leetcodeReview.review6;

/**
 * @author liqiqi_tql
 * @date 2021/3/27 -9:34
 */
public class T42 {
    public int trap(int[] height){
     int sum=0;
     for (int i=1;i<height.length-1;i++){
         int maxLeft=0;
         for (int j=i-1;j>=0;j--){
             if (height[j]>maxLeft){
                 maxLeft=height[j];
             }
         }
         int maxRight=0;
         for (int j=i+1;j<height.length;j++){
             if (height[j]>maxRight){
                 maxRight=height[j];
             }
         }
         int min=Math.min(maxLeft,maxRight);
         if (min>height[i]){
                 sum=sum+(min-height[i]);
         }
     }
     return sum;
    }
}
