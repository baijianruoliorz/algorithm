package leetCode.t38;

/**
 * @author liqiqi_tql
 * @date 2021/4/4 -20:37
 */
public class T63 {
    public int minPathSum(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp=new int[rows][cols];
        dp[0][0]=1;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                 if (i==0&&j==0){
                     dp[i][j]=grid[i][j];
                }else {
                     int below=i>0?dp[i-1][j]+grid[i][j]:Integer.MAX_VALUE;
                     int right=j>0?dp[i][j-1]+grid[i][j]:+Integer.MAX_VALUE;
                     dp[i][j]=Math.min(below,right);
                 }

            }
        }
        return dp[rows-1][cols-1];
    }
}
