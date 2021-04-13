package leetCode.day42;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -20:31
 */
public class T191 {
    public int hammingWeight(int n){
        int sum=0;
        while (n!=0){
            n&=(n-1);
            sum++;
        }
        return sum;
    }
}
