package leetCode.day33;

/**
 * @author liqiqi_tql
 * @date 2021/4/8 -22:22
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
