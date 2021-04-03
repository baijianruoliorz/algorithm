package leetcodeReview.reviewDP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/3 -21:02
 */
public class T1547 {
    public int minCost(int n,int[] cuts){
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(n);
        for (int num:cuts){
            list.add(num);
        }
        Collections.sort(list);
        int m=list.size();
        int[][] dp=new int[m][m];
        for (int len=2;len<m;len++){
            for (int i=0;i+len<m;i++){
                int j=i+len;
                dp[i][j]=Integer.MAX_VALUE;
                for (int k=i+1;k<j;k++){
                    dp[i][j]=Math.min(dp[i][j],dp[i][k] + dp[k][j] + list.get(j) - list.get(i));
                }
            }
        }
        return dp[0][m-1];
    }
}
