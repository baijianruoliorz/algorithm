package leetCode.day36;

/**
 * @author liqiqi_tql
 * @date 2021/3/21 -15:13
 */
public class T344 {
    public void reverseString(char[] s){
        int len = s.length;
        int start=0;
        char cmp;
        while (start<len-1){
            cmp=s[start];
            s[start]=s[len-1];
            s[len-1]=cmp;
        }
        return;
    }
}
