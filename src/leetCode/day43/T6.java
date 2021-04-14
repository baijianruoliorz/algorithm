package leetCode.day43;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -20:29
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
        int i=0,flage=-1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i==0||i==numRows-1){
                flage=-flage;
            }
            i+=flage;
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (StringBuilder row : rows) {
            stringBuilder.append(row);
        }
        return stringBuilder.toString();
    }
}
