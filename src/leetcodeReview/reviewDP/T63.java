package leetcodeReview.reviewDP;

/**
 * @author liqiqi_tql
 * @date 2021/4/4 -20:30
 */
public class T63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0]=1;
        if (obstacleGrid[0][0]==1){
            return 0;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (obstacleGrid[i][j] != 1) {
                    if (i > 0 && j > 0) {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    } else if (i > 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else if (j > 0) {
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }
        }
        return dp[rows - 1][cols - 1];

    }

}
