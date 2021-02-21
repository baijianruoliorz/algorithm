package leetCode.day21;

/**
 * @author liqiqi_tql
 * @date 2021/2/21 -16:38
 */
public class T35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int left = 0, right = n - 1, ans = n;
            while (left <= right) {
                int mid = ((right - left) >> 1) + left;
                if (target <= nums[mid]) {
                    ans = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
    }
}
