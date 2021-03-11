package leetcodeReview.review4;

/**
 * @author liqiqi_tql
 * @date 2021/3/11 -11:05
 */
public class T67 {
    public String addBinary(String a,String b){
        int m = a.length();
        StringBuffer ans=new StringBuffer();
        int n = b.length();
        int max=Math.max(m,n);
        int carry=0;
        for (int i=0;i<max;i++){
            carry+=i<m?(a.charAt(a.length()-1-i)-'0'):0;
            carry+=i<n?(b.charAt(b.length()-1-i)-'0'):0;
            ans.append((char)(carry%2+'0'));
            carry/=2;
        }
        if (carry>0){
            ans.append('1');
        }
        ans.reverse();
        return ans.toString();
    }
}
