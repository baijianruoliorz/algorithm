package leetcodeReview.reviewDP;

/**
 * @author liqiqi_tql
 * @date 2021/4/3 -9:55
 */
public class T474 {
    public int findMaxForm(String[] strs,int m,int n){
     int[][] dp=new int[m+1][n+1];
     for (int i=0;i<strs.length;i++){
         int zero=0,one=0;
         for (int f=0;f<strs[i].length();f++){
             if (strs[i].charAt(f)=='0'){
                 zero++;
             }else {
                 one++;
             }
         }
         for (int x=m;x>=0;x--){
             if (x-zero<0){
                 continue;
             }
             for (int y=n;y>=0;y--){
                 if (y-one<0){
                     continue;
                 }
                dp[x][y]=Math.max(dp[x-zero][y-one]+1,dp[x][y]);
             }
         }
     }
     return dp[m][n];
    }
}
