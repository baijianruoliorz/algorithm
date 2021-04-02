package leetCode.day37;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/2 -19:18
 */
public class T452 {
    public int findMinArrowShots(int[][] points){
        int length = points.length;
        if (length==0){
            return 0;
        }
        Arrays.sort(points,(o1,o2)->{
            return o1[1]-o2[1];
        });
        int cnt=1,end=points[0][1];
        for (int i=1;i<length;i++){
            if (points[i][0]<=end){
              continue;
            }
            end=points[i][1];
            cnt++;
        }
        return cnt;
    }
}
