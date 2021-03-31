package leetCode.day37;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/3/31 -9:53
 */
public class T454 {
    public int fourSumCount(int[] A,int[] B,int[] C,int[] D){
        Map<Integer,Integer> countAB=new HashMap<>();
        for (int u:A){
            for (int v:B){
                countAB.put(u+v,countAB.getOrDefault(u+v,0)+1);
            }
        }
        int ans=0;
        for (int u:C){
            for (int v:D){
                if (countAB.containsKey(-u-v)){
                    ans+=countAB.get(-u-v);
                }
            }
        }
        return ans;
    }
}
