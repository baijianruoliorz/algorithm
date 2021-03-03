package leetCode.day28;

import java.util.PriorityQueue;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -15:07
 */
public class T215 {
    public int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int num:nums){
            pq.add(num);
            if (pq.size()>k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}
