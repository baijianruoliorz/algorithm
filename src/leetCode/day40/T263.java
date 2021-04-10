package leetCode.day40;

/**
 * @author liqiqi_tql
 * @date 2021/4/10 -16:22
 */
public class T263 {
    public boolean isUgly(int n){
        if (n==1){
            return true;
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
