package leetCode.day26;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/3/2 -12:55
 */
public class T56 {
    public int[][] merge(int[][] intervals){
//        先按照起始位置排序
        Arrays.sort(intervals,(v1,v2)->v1[0]-v2[0]);
        int[][] res=new int[intervals.length][2];
        int idx=-1;
        for (int[] interval : intervals) {
            if (idx==-1||interval[0]>res[idx][1]){
                res[++idx]=interval;
            }else{
                res[idx][1]=Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,idx+1);

    }
}
