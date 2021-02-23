package leetCode.day23;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/2/23 -21:31
 */
public class T252 {
    class Solution {
        public boolean canAttendMeetings(int[][] intervals) {
            // 将区间按照会议开始实现升序排序
            Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
            // 遍历会议，如果下一个会议在前一个会议结束之前就开始了，返回 false。
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < intervals[i - 1][1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
