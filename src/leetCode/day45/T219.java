package leetCode.day45;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -11:29
 */
public class T219 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < nums.length; i++) {
                if(set.contains(nums[i])) {
                    return true;
                }
                set.add(nums[i]);
                if(set.size() > k) {
                    set.remove(nums[i - k]);
                }
            }
            return false;
        }
    }


}
