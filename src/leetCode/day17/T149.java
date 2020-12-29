package leetCode.day17;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2020/12/29 -14:57
 */
public class T149 {
    public int maxPoints(int[][] points) {
        if(points.length==1) {
            return 1;
        }
        int max=0;
        for (int i = 0; i < points.length; i++) {
            int[] pointX=points[i];
            int same=0;
            Map<Double,Integer> slope=new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if(i==j) {
                    continue;
                }
                int[] pointY=points[j];
                double width=pointY[0]-pointX[0];
                double height=pointY[1]-pointX[1];
                int isSame=0;
                if(width==0&&height==0){
                    same++;
                    isSame=1;
                }
                double k=(height*1000000000/width);
                int had=slope.getOrDefault(k,0);
                had++;
                max=Math.max(had+1+same-isSame,max);
                if(isSame!=1) {
                    slope.put(k,had);
                }
            }
            //System.out.println(slope);
        }
        return max;
    }
}
