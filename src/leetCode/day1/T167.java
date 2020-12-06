package leetCode.day1;

/**
 * @author liqiqi_tql
 * @date 2020/12/5 -11:31
 */
public class T167 {
 public int[] twoSum(int[] numbers,int target){
     for (int i = 0; i < numbers.length; i++) {
         int low=i+1,high=numbers.length-1;
         while (low<=high){
             int mid=(high-low)/2+low;
             if (numbers[mid]==target-numbers[i]){
                 return new int[]{i+1,mid+1};
             }else if(numbers[mid]>target-numbers[i]){
                 high=mid-1;
             }else {
                 low=mid+1;
             }
         }
     }
   return new int[]{-1,-1};
 }


}
