package leetCode.day36;

/**
 * @author liqiqi_tql
 * @date 2021/3/19 -21:28
 */
public class T605 {
    public boolean canPlaceFlowers(int[] flowerbed,int n){
        int len = flowerbed.length;
        for (int i=1;i<len-1;i++){
            if (flowerbed[i-1]==0&&flowerbed[i+1]==0&&flowerbed[i]==0){
                n--;
                flowerbed[i]=1;
            }
        }
        if (n==0){
            return true;
        }else {
            return false;
        }
    }
}
