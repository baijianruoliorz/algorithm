package leetCode.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2020/12/6 -22:13
 */
//todo review
public class T347 {

    public int[] topKFrequent(int[] nums,int k){
        Map<Integer, Integer> frequencyForNum = new HashMap<>();
        for (int num : nums) {
            frequencyForNum.put(num,frequencyForNum.getOrDefault(num,0)+1);
        }
//      这一步注意
        List<Integer>[] buckets=new ArrayList[nums.length+1];
        for (Integer key : frequencyForNum.keySet()) {
            Integer frequency = frequencyForNum.get(key);
            if (buckets[frequency]==null){
                buckets[frequency]=new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> topk=new ArrayList<>();
        for (int i=buckets.length-1;i>=0&&topk.size()<k;i--){
            if (buckets[i]==null){
                continue;
            }
            if (buckets[i].size()<=(k-topk.size())){
                topk.addAll(buckets[i]);
            }else {
                topk.addAll(buckets[i].subList(0,k-topk.size()));
            }
        }
        int[] res=new int[k];
        for (int i=0;i<k;i++){
            res[i]=topk.get(i);
        }
        return res;
    }


}
