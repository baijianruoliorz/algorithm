package leetCode.day3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author liqiqi_tql
 * @date 2020/12/7 -10:51
 */
public class T452 {
public int findMinArrowShots(int[][] points){
    if (points.length==0){
        return 0;
    }
    Arrays.sort(points, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            return (o1[1]<o2[1])?-1:((o1[1]==o2[1])?0:1);
        }
    });
    int cnt=1,end=points[0][1];
    for(int i=1;i<points.length;i++){
        if (points[i][0]<=end){
            continue;
        }
        cnt++;
        end=points[i][1];
    }
    return cnt;
}

}
