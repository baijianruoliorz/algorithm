package leetcodeReview.review2;

/**
 * @author liqiqi_tql
 * @date 2021/3/8 -11:13
 */
public class T9 {
    public boolean isPalindrome(int x){
        String string = Integer.toString(x);
        return isPalindrome2(string);
    }
    public boolean isPalindrome2(String s){
        int length = s.length();
        int i=0;
        while (i<length-1){
            if (s.charAt(length-1)!=s.charAt(i)){
                return false;
            }
            i++;
            length--;
        }
        return true;
    }
}
