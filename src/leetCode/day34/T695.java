package leetCode.day34;

/**
 * @author liqiqi_tql
 * @date 2021/3/11 -9:55
 */
public class T695 {
    private int m,n;
    private int[][] direction={{0,1},{1,0},{0,-1},{-1,0}};
    public int maxAreaOfIsLand(int[][] grid){
        if(grid==null||grid.length==0||grid[0].length==0){
            return 0;
        }
        int maxArea=0;
        m=grid.length;

        for (int i=0;i<m;i++){
            for (int j=0;j<grid[0].length;j++){
                maxArea=Math.max(maxArea,dfs(grid,i,j));
            }
        }
         return maxArea;
    }

    private int dfs(int[][] grid, int r, int c) {
        if (c<0||r>=m||c>=n||r<0||grid[r][c]==0){
            return 0;
        }
        grid[r][c]=0;
        int area=1;
        for (int[] d : direction) {
            area+=dfs(grid,r+d[0],c+d[1]);
        }
        grid[r][c]=1;
        return area;
    }
}
