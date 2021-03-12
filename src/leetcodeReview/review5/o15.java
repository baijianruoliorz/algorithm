package leetcodeReview.review5;

/**
 * @author liqiqi_tql
 * @date 2021/3/11 -13:22
 */
public class o15 {
    public int hammingWeight(int n){
        int num=0;
        int h=1;
        while (n!=0){
            n&=n-1;
            num++;
        }
        return num;
    }
}
