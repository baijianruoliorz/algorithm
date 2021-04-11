package leetCode.day40;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -16:24
 */
public class T695 {
    public int maxAreaOfIsland(int[][] grid){
        int ans=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                ans=Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i<0||j<0||i==grid.length||j==grid[0].length||grid[i][j]!=1){
            return 0;
        }
        grid[i][j]=0;
        int[] di={0,0,-1,1};
        int[] dj={1,-1,0,0};
        int ans=1;
        for (int index=0;index!=4;index++){
            ans+=dfs(grid,i+di[index],j+dj[index]);
        }
        return ans;
    }
}
