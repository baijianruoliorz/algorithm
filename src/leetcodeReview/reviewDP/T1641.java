package leetcodeReview.reviewDP;

/**
 * @author liqiqi_tql
 * @date 2021/4/3 -17:49
 */
public class T1641 {
    public int countVowelStrings(int n){
        int[] dp=new int[]{1,1,1,1,1};
        for (int i=1;i<n;i++){
            for (int j=1;j<5;j++){
                dp[j]+=dp[j-1];
            }
        }
        return dp[0]+dp[1]+dp[2]+dp[3]+dp[4];
    }
}
