package leetCode.day15;

/**
 * @author liqiqi_tql
 * @date 2020/12/28 -15:10
 */
public class T171 {
    public int titleToNumber(String s){
        int ans=0;
        for (int i=0;i<s.length();i++){
            int num=s.charAt(i)-'A'+1;
            ans=ans*26+num;
        }
        return ans;
    }
}
