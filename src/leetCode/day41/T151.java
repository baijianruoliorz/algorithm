package leetCode.day41;

/**
 * @author liqiqi_tql
 * @date 2021/4/12 -9:16
 */
public class T151 {
    public String reverseWords(String s){
        s=s.trim();
        String[] s1 = s.split(" ");
        for (int i=0;i<s1.length;i++){
            s1[i]=s1[i].trim();
        }

        StringBuilder stringBuilder=new StringBuilder();
        for (int i=s1.length-1;i>=0;i--){
            stringBuilder.append(s1[i]+" ");
        }
        return stringBuilder.toString().trim();
    }
}
