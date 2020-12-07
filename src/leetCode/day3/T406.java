package leetCode.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/12/7 -10:58
 */
//todo review
public class T406 {
  public int[][] reconstructQueue(int[][] people){
    if (people==null||people.length==0||people[0].length==0){
      return new int[0][0];
    }
    Arrays.sort(people,(a,b)->(a[0]==b[0]?a[1]-b[1]:b[0]-a[0]));
    List<int[]> queue=new ArrayList<>();
    for (int[] p : people) {
      queue.add(p[1],p);
    }
   return queue.toArray(new int[queue.size()][]);

  }

}
