package leetCode.day39;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author liqiqi_tql
 * @date 2021/4/8 -19:54
 */
public class T150 {
    public int evalRPN(String[] tokens){
        Deque<Integer> stack=new ArrayDeque<>();
        int n = tokens.length;
        for (int i=0;i<n;i++){
            String token=tokens[i];
            if (isNumber(token)){
                stack.add(Integer.parseInt(token));
            }else {
                Integer poll = stack.pop();
                Integer pop2 = stack.pop();
                switch (token){
                    case "+":{
                        stack.push(pop2+poll);
                        break;
                    }
                    case "-":
                        stack.push(pop2-poll);
                        break;
                    case "*":
                        stack.push(pop2*poll);
                        break;
                    case "/":
                        stack.push(pop2/poll);
                        break;
                    default:break;
                }
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String token) {
        return !("+".equals(token)||"-".equals(token)||
                "*".equals(token)||"/".equals(token));
    }
}
