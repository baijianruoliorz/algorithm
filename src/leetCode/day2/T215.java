package leetCode.day2;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author liqiqi_tql
 * @date 2020/12/6 -21:35
 */
public class T215 {
   public int findKthLargest(int[] nums,int k){
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for (int num : nums) {
           pq.add(num);
           if (pq.size()>k) {
               pq.poll();
           }
       }
       return pq.peek();
   }

}



