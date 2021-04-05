package leetcodeReview.reviewDP;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/4 -22:02
 */
public class T179method2 {
    public String largestNumber(int[] nums){
     String[] s=new String[nums.length];
        Arrays.fill(s,"");
       for (int i=0;i<nums.length;i++){
           s[i]+=nums[i];
       }
       Arrays.sort(s,(o1,o2)->{
          return -o1.compareTo(o2);
       });
       for (int i=1;i<s.length;i++){
           if (s[i].indexOf(s[i-1])>0){
               if (s[i].charAt(s[i].length()-1)<s[i-1].charAt(0)){
                   String des;
                   des=s[i];
                   s[i]=s[i-1];
                   s[i-1]=des;
               }
           }
       }

     String target="";
        for (String s1 : s) {
            target+=s1;
        }
        return target;
    }

}
