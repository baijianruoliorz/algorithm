package leetCode.day3;

/**
 * @author liqiqi_tql
 * @date 2020/12/7 -11:12
 */
public class T121 {
public int maxProfit(int[] prices){
    int n=prices.length;
    if (n==0) {
        return 0;
    }
    int soFarMin=prices[0];
    int max=0;
    for (int i=1;i<n;i++){
        if (soFarMin>prices[i]) {
            soFarMin=prices[i];
        } else {
            max=Math.max(max,prices[i]-soFarMin);
        }
    }
    return max;
}
}
