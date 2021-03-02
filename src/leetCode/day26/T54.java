package leetCode.day26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/2 -10:58
 */
public class T54 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> order = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return order;
            }
//        m行n列
            int m = matrix.length - 1, n = matrix[0].length - 1, a = 0, b = 0;
            int number = 0;
            int w=matrix.length;int s=matrix[0].length;
            int tax=s*w;
            while (number < tax) {
                for (int i = b; i <= n; i++) {
                    order.add(matrix[a][i]);
                    number++;
                }
                a++;
                for (int i = a; i <= m; i++) {
                    order.add(matrix[i][n]);
                    number++;
                }
                n--;
                for (int i = n - 1; i >= b; i--) {
                    order.add(matrix[m][i]);
                    number++;
                }
                m--;
                for (int i = m - 1; i >= a; i--) {
                    order.add(matrix[i][b]);
                    number++;
                }
                b++;

            }

            return order;


        }
    }
}
