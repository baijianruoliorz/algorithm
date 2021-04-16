package leetCode.day46;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -11:23
 */
public class T441 {
    public int arrangeCoins(int n){
        int i=0;
        while (sum(i)<n){
            i++;
        }
        if (sum(i-1)==n) {
            return i;
        }else {
            return i-1;
        }
    }
    public int sum(int n){
        int sum=0;
        while (n!=0){
            sum+=n;
            n--;
        }
        return sum;
    }

}
