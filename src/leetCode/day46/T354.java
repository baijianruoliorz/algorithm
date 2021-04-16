package leetCode.day46;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -10:06
 */
public class T354 {
    public int maxEnvelopes(int[][] envelopes){
        int n=envelopes.length;
        if (n==0){
            return 0;
        }
        int[] dp=new int[n];
        Arrays.sort(envelopes,(o1,o2)->{
            if (o1[0]==o2[0]){
                return o1[1]-o2[1];
            }else {
                return o1[0]-o2[0];
            }
        });
        int result=0;
        for (int i=0;i<n;i++){
            dp[i]=1;
            for (int j=0;j<i;j++){
                if (envelopes[j][0]<envelopes[i][0]&&envelopes[j][1]<envelopes[i][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            result=Math.max(result,dp[i]);
        }
        return result;
    }
}
