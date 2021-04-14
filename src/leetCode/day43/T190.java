package leetCode.day43;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -19:50
 */
public class T190 {
    public int reverseBits(int n){
      StringBuilder stringBuilder=new StringBuilder();
      String num=Integer.toBinaryString(n);
      if (n>=0&&num.length()<32){
          int k=32-num.length();
          while (k>0){
              num="0"+num;
              k--;
          }
      }
      return Integer.parseUnsignedInt(stringBuilder.append(num).reverse().toString(),2);
    }
}
