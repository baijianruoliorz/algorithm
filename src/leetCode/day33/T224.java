package leetCode.day33;

import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2021/3/10 -16:39
 */
public class T224 {
    public int calculate(String s){
     int res=0;
     int num=0;
     int sign=1;
        Stack<Integer> stack=new Stack<>();
        char[] chars=s.toCharArray();
        int length = chars.length;
        for(int i=0;i<length;i++){
            char c = chars[i];
            if (c==' '){
                continue;
            }
            if (Character.isDigit(c)){
                num=num*10+c-'0';
                if (i<length-1&&Character.isDigit(chars[i+1])){
                    continue;
                }
            }else if (c=='+'||c=='-'){
                num=0;
                sign=c=='+'?1:-1;
            }else if (c=='('){
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
            }else if (c==')'){
                sign=stack.pop();
                num=res;
                res=stack.pop();
            }
            res+=sign*num;
        }
        return res;

    }
}

