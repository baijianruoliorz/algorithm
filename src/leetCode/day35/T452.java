package leetCode.day35;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/3/19 -9:40
 */
public class T452 {
    public int findMinArrowShots(int[][] points){
        if (points.length==0){
            return 0;
        }
        Arrays.sort(points,(o1,o2)->o1[1]-o2[1]);
        int cnt=1,end=points[0][1];
        for (int i=1;i<points.length;i++){
            if (points[i][0]<=end){
                continue;
            }
            cnt++;
            end=points[i][1];
        }
        return cnt;
    }
}
