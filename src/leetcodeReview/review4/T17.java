package leetcodeReview.review4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liqiqi_tql
 * @date 2021/3/9 -10:34
 */
public class T17 {
    public List<String> letterCombinations(String digits){
        List<String> combinations = new ArrayList<>();
        if (digits.length()==0){
            return combinations;
        }
        Map<Character,Character[]> map=new HashMap<Character, Character[]>(){{
           put('2',new Character[]{'a','b','c'});
           put('3',new Character[]{'d','e','f'});
           put('4',new Character[]{'g','h','i'});
           put('5',new Character[]{'j','k','l'});
           put('6',new Character[]{'m','n','o'});
           put('7',new Character[]{'p','q','r','s'});
           put('8',new Character[]{'t','u','v'});
           put('9',new Character[]{'w','x','y','z'});
        }};
       backtrack(combinations,map,digits,0,new StringBuffer());
       return combinations;
    }

    private void backtrack(List<String> combinations, Map<Character, Character[]> map, String digits, int index, StringBuffer stringBuffer) {
        if (index==digits.length()){
            combinations.add(stringBuffer.toString());
        }else {
            char digit = digits.charAt(index);
            Character[] characters = map.get(digit);
            int length = characters.length;
            for (int i=0;i<length;i++){
                stringBuffer.append(characters[i]);
                backtrack(combinations,map,digits,index+1,stringBuffer);
                stringBuffer.deleteCharAt(stringBuffer.length()-1);
            }
        }
    }
}
