package leetCode.day45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -11:08
 */
public class T229 {
    public List<Integer> majorityElement(int[] nums){
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int num : nums) {
            hashmap.put(num,hashmap.getOrDefault(num,0)+1);
        }
        for (Integer integer : hashmap.keySet()) {
            if (hashmap.get(integer)>=nums.length/3+1){
                list.add(integer);
            }
        }
        return list;


    }
}
