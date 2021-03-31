package leetCode.day37;

/**
 * @author liqiqi_tql
 * @date 2021/3/31 -10:11
 */
public class T518 {
    public int change(int amount,int[] coins){
        int[] dp=new int[amount+1];
        dp[0]=1;
        for (int i=0;i<coins.length;i++){
            for (int j=coins[i];j<=amount;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}
