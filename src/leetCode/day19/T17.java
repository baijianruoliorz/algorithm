package leetCode.day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/2/19 -15:03
 */
public class T17 {

}
class Solution{
    public List<String> letterCombinations(String digits){
        List<String> combinations=new ArrayList<>();
        if (digits.length()==0){
            return combinations;
        }
        Map<Character,String> phonemap = new HashMap<>();
        phonemap.put('2',"abc");
        phonemap.put('3',"def");
        phonemap.put('4',"ghi");
        phonemap.put('5',"jkl");
        phonemap.put('6',"mno");
        phonemap.put('7',"pqrs");
        phonemap.put('8',"tuv");
        phonemap.put('9',"wxyz");
     backtrack(combinations,phonemap,digits,0,new StringBuffer());
     return combinations;

    }

    private void backtrack(List<String> combinations, Map<Character, String> phonemap, String digits, int index, StringBuffer combination) {
        if (index==digits.length()){
            combinations.add(combinations.toString());
        }else{
            char digit=digits.charAt(index);
            String letters=phonemap.get(digit);
            int lengthsCount = letters.length();
            for (int i=0;i<lengthsCount;i++){
                combination.append(letters.charAt(i));
                backtrack(combinations,phonemap,digits,index+1,combination);
                combination.deleteCharAt(index);
            }
        }
    }
}
