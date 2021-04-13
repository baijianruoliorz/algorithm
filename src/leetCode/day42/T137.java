package leetCode.day42;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -21:23
 */
public class T137 {
    public int singleNumber(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer)==1){
                return integer;
            }
        }
        return 0;
    }
}
