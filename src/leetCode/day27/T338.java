package leetCode.day27;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -8:44
 */
public class T338 {
    public int[] countBits(int num){
    int[] bits=new int[num+1];
    for (int i=0;i<=num;i++){
        bits[i]=countOnes(i);
    }
    return bits;
    }
    public int countOnes(int x){
        int ones=0;
        while(x>0){
            x&=(x-1);
            ones++;
        }
        return ones;
    }

}
