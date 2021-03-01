package leetCode.day25;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liqiqi_tql
 * @date 2021/3/1 -20:41
 */
public class T73 {
   class Solution{
       public void setZeroes(int[][] matrix){
           int R=matrix.length;
           int C=matrix[0].length;
           Set<Integer> rows = new HashSet<>();
           Set<Integer> cols=new HashSet<>();
           for (int i=0;i<R;i++){
               for (int j=0;j<C;j++){
                   if (matrix[i][j]==0){
                       rows.add(i);
                       cols.add(j);
                   }
               }
           }
           for (int i=0;i<R;i++){
               for (int j=0;j<C;j++){
                   if (rows.contains(i)||cols.contains(j)){
                       matrix[i][j]=0;
                   }
               }
           }
       }
   }
}
