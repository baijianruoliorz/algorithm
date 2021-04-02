package leetCode.day37;

/**
 * @author liqiqi_tql
 * @date 2021/4/2 -20:40
 */
public class T72 {
    public int minDistance(String word1,String word2){
        int length = word1.length();
        int length1 = word2.length();
        int[][] dp=new int[length+1][length1+1];
        for (int i=1;i<=length;i++){
            dp[i][0]=dp[i-1][0]+1;
        }
        for (int j=1;j<=length1;j++){
            dp[0][j]=dp[0][j-1]+1;
        }
        for (int i=1;i<=length;i++){
            for (int j=1;j<=length1;j++){
                dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                if (word1.charAt(i-1)==word2.charAt(j-1)) {
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j-1]);
                }

            }
        }
        return dp[word1.length()][word2.length()];
    }
}
