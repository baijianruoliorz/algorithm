package leetCode.day47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/4/17 -11:03
 */
public class T17 {
    public List<String> letterCombinations(String digits){
        List<String> res=new ArrayList<>();
        if (digits.length()==0){
            return res;
        }
        Map<Character,String> map=new HashMap<Character, String>(){{
           put('2',"abc");
           put('3',"def");
           put('4',"ghi");
           put('5',"jkl");
           put('6',"mno");
           put('7',"pqrs");
           put('8',"tuv");
           put('9',"wxyz");
        }};
        backTraceing(res,map,0,digits,new StringBuilder());
        return res;
    }

    private void backTraceing(List<String> res, Map<Character, String> map, int
            index, String digits, StringBuilder stringBuilder) {
        if (index==digits.length()){
            res.add(stringBuilder.toString());
    }else {
            char digit = digits.charAt(index);
            String s=map.get(digit);
            for (int i=0;i<s.length();i++){
                stringBuilder.append(s.charAt(i));
                backTraceing(res,map,index+1,digits,stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
        }
    }
}
