package leetCode.day41;

import java.util.Arrays;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -21:18
 */
public class T781 {
    public int numRabbits(int[] answers){
        int len=answers.length;
        if (len==0){
            return 0;
        }
        Arrays.sort(answers);
        int sum=0;
        for (int i=0;i<len;i++){
            sum+=answers[i]+1;
            int res=answers[i];
            while (res>0&&i+1<len&&answers[i]==answers[i+1]){
                res--;
                i++;
            }
        }
        return sum;
    }
}
