package leetCode.day40;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -15:00
 */
public class T73 {
    public void setZeroes(int[][] matrix){
        int R = matrix.length;
        int C = matrix[0].length;
        Set<Integer> rows=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){

             if (matrix[i][j]==0) {
                 rows.add(i);
                 cols.add(j);
             }
            }
        }
    for(int i=0;i<R;i++) {
        for (int j = 0; j < C; j++) {
            if (rows.contains(i) || cols.contains(j)) {
                matrix[i][j] = 0;
            }
        }
    }
    }

}
