package leetcodeReview.review3;

/**
 * @author liqiqi_tql
 * @date 2021/3/8 -15:45
 */
public class T14 {
    public String longestCommonPrefix(String[] strs){
       if (strs.length==0) {
           return "";
       }
           String ans=strs[0];
           for (int i=1;i<strs.length;i++){
               int j=0;
               for (;j<ans.length()&&j<strs[i].length();j++){
                   if (ans.charAt(j)!=strs[i].charAt(j)){
                       break;
                   }
                   ans=ans.substring(0,j);
                   if (ans.equals("")){
                       return ans;
                   }
               }
           }
           return ans;
    }
}
