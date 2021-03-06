package leetcodeReview.review1;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -14:14
 */
public class T5method2 {
    public String longestPalindrome(String s){
        int length = s.length();
        if (length<2){
            return s;
        }
        int maxLen=1;
        int begin=0;
        boolean[][] dp=new boolean[length][length];
        char[] charArray = s.toCharArray();
//        dp的初始值都是true
        for (int i=0;i<length;i++){
            dp[i][i]=true;
        }
        for (int j=1;j<length;j++){
            for (int i=0;i<j;i++){
                if (charArray[i]!=charArray[j]){
                    dp[i][j]=false;
                }else {
                    if (j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }
                if (dp[i][j]&&j-i+1>maxLen){
                    maxLen=j-i+1;
                    begin=i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
