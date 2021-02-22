package leetCode.day22;

/**
 * @author liqiqi_tql
 * @date 2021/2/22 -10:47
 */
public class T38 {

    class Solution{
        public String countAndSay(int n){
            String res="1";
            for (int i=2;i<=n;i++){
                StringBuilder temp=new StringBuilder();
                for (int j=0;j<res.length();j++){
                    int count=1;
                    while (j+1<res.length()&&res.charAt(j)==res.charAt(j+1)){
                        count++;
                        j++;
                    }
                    temp.append(count).append(res.charAt(j));
                }
                res=temp.toString();
            }
            return res;
        }
    }
}
