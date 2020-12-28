package leetCode.day15;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2020/12/28 -15:31
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
