package leetcodeReview.review6;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/15 -9:04
 */
public class T54 {
    public List<Integer> spiralOrder(int[][] matrix){
       LinkedList<Integer> result=new LinkedList<>();
       if (matrix==null||matrix.length==0) {
           return result;
       }
       int left=0;
       int right=matrix[0].length-1;
       int top=0;
       int bottom=matrix.length-1;
       int numEle=matrix.length*matrix[0].length;
       while (numEle>=1){
           for (int i=left;i<=right&&numEle>=1;i++){
               result.add(matrix[top][i]);
               numEle--;
           }
           top++;
           for (int i=top;i<=bottom&&numEle>=1;i++){
               result.add(matrix[i][right]);
               numEle--;
           }
           right--;
           for (int i=right;i>=left&&numEle>=1;i--){
               result.add(matrix[bottom][i]);
               numEle--;
           }
           bottom--;
           for (int i=bottom;i>=top&&numEle>=1;i--){
               result.add(matrix[i][left]);
               numEle--;
           }
           left++;
       }
       return result;
    }
}
