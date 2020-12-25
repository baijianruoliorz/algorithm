package leetCode.day10;

/**
 * @author liqiqi_tql
 * @date 2020/12/25 -15:17
 */
public class T240 {
    public boolean searchMatrix(int[][] matrix,int target){
        int row=matrix.length-1;
        int col=0;
        while (row>=0&&col<matrix[0].length){
            if (matrix[row][col]>target){
                row--;
            }else if (matrix[row][col]<target){
                col++;
            }else {
                return true;
            }
        }
        return false;
    }
}
