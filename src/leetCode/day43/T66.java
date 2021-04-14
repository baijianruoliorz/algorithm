package leetCode.day43;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -17:26
 */
public class T66 {
    public int[] plusOne(int[] digits){
       for (int i=digits.length-1;i>=0;i--) {
           digits[i]++;
           digits[i] = digits[i] % 10;
           if (digits[i] != 0) {
               return digits;
           }
       }
           digits = new int[digits.length + 1];
           digits[0] = 1;
           return digits;

    }
}
