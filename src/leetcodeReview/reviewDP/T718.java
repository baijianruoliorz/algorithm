package leetcodeReview.reviewDP;

/**
 * @author liqiqi_tql
 * @date 2021/3/27 -20:50
 */
public class T718 {
    public int findLength(int[] A,int[] B){
        int lenA = A.length;
        int lenB = B.length;
        int[][] dp=new int[lenA+1][lenB+1];
        int ans=0;
        for (int i=1;i<=lenA;i++){
           for (int j=1;j<=lenB;j++){
               if (A[i-1]==B[j-1]){
                   dp[i][j]=dp[i-1][j-1]+1;
                   ans=Math.max(ans,dp[i][j]);
               }
           }
        }
        return ans;
    }
}
