package leetCode.day46;

/**
 * @author liqiqi_tql
 * @date 2021/4/16 -10:20
 */
public class T392 {
    public boolean isSubsequence(String s,String t){
        int index=-1;
        for (char c : s.toCharArray()) {
            index=t.indexOf(c,index+1);
            if (index==-1){
                return false;
            }
        }
        return true;
    }
}
