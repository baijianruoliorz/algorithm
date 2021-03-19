package leetCode.day36;

/**
 * @author liqiqi_tql
 * @date 2021/3/19 -21:20
 */
public class T191 {
    public int hammingWeight(int n){
        int num=0;
        int h=1;
        for (int i=0;i<32;i++){
            if ((n&h)!=0){
                num++;
            }
            h<<=1;
        }
        return num;
    }
}
