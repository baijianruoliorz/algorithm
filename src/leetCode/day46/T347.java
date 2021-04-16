package leetCode.day46;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -9:33
 */
public class T347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : map.keySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(map.get(i));
            } else if (priorityQueue.size() == k) {
                if (map.get(i) > priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.add(map.get(i));
                }
            }
        }
        int[] sum = new int[k];
        int j = 0;
        for (Integer integer : map.keySet()) {
            if (priorityQueue.contains(map.get(integer))){
                sum[j++]=integer;
            }
        }
        return sum;

    }
}
