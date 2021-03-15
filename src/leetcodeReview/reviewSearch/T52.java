package leetcodeReview.reviewSearch;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liqiqi_tql
 * @date 2021/3/15 -13:44
 */
public class T52 {
    public int totalNQueens(int n){
        Set<Integer> colums = new HashSet<>();
        Set<Integer> diagonals1=new HashSet<>();
        Set<Integer> diagonals2=new HashSet<>();
        return backtrack(n,0,colums,diagonals1,diagonals2);
    }

    private int backtrack(int n, int row, Set<Integer> colums, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row==n){
            return 1;
        }else {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (colums.contains(i)) {
                    continue;
                }
                int diagonal1 = row - i;
                if (diagonals1.contains(diagonal1)) {
                    continue;
                }
                int diagonal2 = row + i;
                if (diagonals2.contains(diagonal2)) {
                    continue;
                }
                colums.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                count += backtrack(n, row + 1, colums, diagonals1, diagonals2);
                colums.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
            return count;
        }
    }
}
