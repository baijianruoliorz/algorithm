package leetCode.day39;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/4/8 -21:13
 */
public class T454 {
    public int fourSumCount(int[] A,int[] B,int[] C,int[] D){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i : A) {
            for (int j : B) {
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        int ans=0;
        for (int i : C) {
            for (int j : D) {
                if (map.get(-i-j)!=null) {
                    ans+=map.get(-i-j);
                }
            }
        }
        return ans;
    }
}
