package leetCode.day46;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -15:46
 */
public class T435 {
    public int eraseOverlapIntervals(int[][] intervals){
        if (intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,(o1,o2)->o1[1]-o2[1]);
        int cnt=1;
        int end=intervals[0][1];
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0]<end){
                continue;
            }
            end=intervals[i][1];
            cnt++;
        }
        return intervals.length-cnt;
    }
}
