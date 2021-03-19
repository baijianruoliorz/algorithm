package leetCode.day36;

/**
 * @author liqiqi_tql
 * @date 2021/3/19 -21:24
 */
public class T191method2 {
    public int hammingWeight(int n){
             int res=0;
             while (n!=0){
                 res++;
                 n&=n-1;
             }
             return res;
    }
}
