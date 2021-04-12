package leetCode.day41;

/**
 * @author liqiqi_tql
 * @date 2021/4/12 -11:18
 */
public class T214 {
    public String shortestPalindrome(String s){
        String reverse=new StringBuffer(s).reverse().toString();
        for (int i=0;i<reverse.length();i++){
            if (s.startsWith(reverse.substring(i))){
                return reverse.substring(0,i)+s;
            }
        }
        return "";
    }
}
