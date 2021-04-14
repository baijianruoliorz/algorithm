package leetCode.day43;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -20:16
 */
public class T202 {
    public int squareSum(int n){
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n){
        int slow=n,fast=squareSum(n);
        while (slow!=fast){
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));
        }
        return slow==1;
    }
}
