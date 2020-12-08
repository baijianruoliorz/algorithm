package leetCode.day3;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -10:51
 */
public class T392 {
    public boolean isSubsequence(String s,String t){
        int index=-1;
        for (char c:s.toCharArray()){
            index=t.indexOf(c,index+1);
            if (index==-1){
                return false;
            }
        }
        return true;
    }
}
