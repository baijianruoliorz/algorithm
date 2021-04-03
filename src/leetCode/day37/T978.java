package leetCode.day37;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/3 -9:23
 */
public class T978 {
    public int maxTurbulenceSize(int[] arr){
        int[] dp=new int[arr.length+1];
        if (arr.length<2){
            return arr.length;
        }
      int[] increased=new int[arr.length];
      int[] decreased=new int[arr.length];
      increased[0]=1;
      decreased[0]=1;
      int res=1;
      for (int i=1;i<arr.length;i++){
          if (arr[i-1]<arr[i]){
              increased[i]=decreased[i-1]+1;
              decreased[i]=1;
          }else if (arr[i-1]>arr[i]){
              decreased[i]=increased[i-1]+1;
              increased[i]=1;
          }else {
              decreased[i]=1;
              increased[i]=1;
          }
          res=Math.max(res,Math.max(increased[i],decreased[i]));
      }
      return res;
    }
}
