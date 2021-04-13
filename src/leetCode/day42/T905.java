package leetCode.day42;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -10:31
 */
public class T905 {
    public int[] sortArrayByParity(int[] A){
       int j=1;
        int length = A.length;
        if (length<=1){
            return A;
        }
        for(int i=0;i<A.length-1;i++){
            if ((A[i]&1)!=0){
                while ((A[j]&1)==0){
                    j++;
                }
                int tep=A[i];
                A[i]=A[j];
                A[j]=tep;
            }
       }
return A;
    }
}
