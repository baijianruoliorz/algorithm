package leetcodeReview.review1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -14:48
 */
public class T6 {
    public String convert(String s,int numRows){
       if (numRows<2){
           return s;
       }
       List<StringBuilder> rows=new ArrayList<>();
       for (int i=0;i<numRows;i++){
           rows.add(new StringBuilder());
       }
       int i=0,flag=-1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i==0||i==numRows-1){
                flag=-flag;
            }
            i+=flag;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder row : rows) {
            stringBuilder.append(row);
        }
        return stringBuilder.toString();
    }
}
