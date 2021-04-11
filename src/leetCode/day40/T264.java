package leetCode.day40;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -10:32
 */
public class T264 {
    public int nthUglyNumber(int n){
        int sum=0;
        int i=1;
        while (sum!=n){
            if (isUgly(i)){
                sum++;
            }
            i++;
        }
        return i-1;
    }
    public boolean isUgly(int n){
        if (n==1){
            return true;
        }
        if (n==0){
            return false;
        }
        if (n%2==0){
            return isUgly(n/2);
        }
        if (n%3==0){
            return isUgly(n/3);
        }
        if (n%5==0){
            return isUgly(n/5);
        }
        return false;
    }
}
