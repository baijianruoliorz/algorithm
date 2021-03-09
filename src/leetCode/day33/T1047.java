package leetCode.day33;

import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2021/3/9 -8:47
 */
public class T1047 {
    public String removeDuplicates(String s){
        char[] chars = s.toCharArray();
        int length = s.length();
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<length;i++){
            if (stack.isEmpty()||chars[i]!=stack.peek()){
                stack.push(chars[i]);
            }else {
                stack.pop();
            }
        }
//        学会使用这个
        Character[] characters = stack.toArray(new Character[stack.size()]);
        char[] arr=new char[characters.length];
        int m=0;
        for (Character character : characters) {
            arr[m++]=character;
        }
        String s1 = new String(arr);
        return s1;
    }
}
