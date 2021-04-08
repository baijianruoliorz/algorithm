package leetCode.day39;

/**
 * @author liqiqi_tql
 * @date 2021/4/8 -21:19
 */
public class T171 {
    public int titleToNumber(String s){
        int len = s.length();
        int ans=0;
        for (int i=0;i<len;i++){
         int num=s.charAt(i)-'A'+1;
         ans=ans*26+num;
        }
        return ans;
    }
}
