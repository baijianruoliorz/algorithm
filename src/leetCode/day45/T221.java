package leetCode.day45;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -10:57
 */
public class T221 {
    public int maximalSquare(char[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int maxSide=0;
        int[][] dp=new int[row+1][col+1];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j]=='1'){
                    dp[i+1][j+1]=Math.min(Math.min(dp[i][j+1],dp[i][j]),dp[i+1][j])+1;
                    maxSide=Math.max(maxSide,dp[i+1][j+1]);
                }
            }
        }
        return maxSide*maxSide;
    }
}
