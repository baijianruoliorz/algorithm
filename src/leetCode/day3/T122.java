package leetCode.day3;

/**
 * @author liqiqi_tql
 * @date 2020/12/7 -11:43
 */
public class T122 {
   public int maxProfit(int[] prices){
       int profit=0;
       for(int i=1;i<prices.length;i++){
           if (prices[i]>prices[i-1]){
               profit+=(prices[i]-prices[i-1]);
           }
       }
       return profit;
   }
}
