package leetCode.day27;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -13:37
 */
public class T121 {
    public int maxProfit(int[] prices){
        int day=prices[0],num=0;
        int n = prices.length;
        if (n==0){
            return 0;
        }
        for (int i=1;i<n;i++){
            if (day>prices[i]){
                day=prices[i];
            }else{
                num=Math.max(num,prices[i]-day);
            }
        }

       return num;
    }
}
