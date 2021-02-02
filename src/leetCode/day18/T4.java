package leetCode.day18;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/2/2 -10:12
 */
public class T4 {
    public double findEMedianSortedArrays(int[] num1,int[] num2){
        int m = num1.length;
        int n =num2.length;
        int[] num3=new int[m+n];
        System.arraycopy(num1,0,num3,0,m);
        int c=m+n;
        System.arraycopy(num2,0,num3,m,n);
        Arrays.sort(num3);
        if (c%2==0){
            double a2=( num3[(m + n) /2  - 1]+num3[(m+n)/2])/2.0;
            return a2;
        }else {
            double a1=num3[(m+n+1)/2-1]/1.0;
            return a1;

        }
    }

    public static void main(String[] args) {
        int[] num1={1,3};
        int[] num2={2,4};
        T4 t4 = new T4();
        double eMedianSortedArrays = t4.findEMedianSortedArrays(num1, num2);
        System.out.println(eMedianSortedArrays);
    }
}
