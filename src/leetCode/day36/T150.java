package leetCode.day36;

import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2021/3/20 -9:47
 */
public class T150 {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();
        int n=tokens.length;
        for (int i=0;i<n;i++){
            String token=tokens[i];
            if (isNumber(token)){
                stack.push(Integer.parseInt(token));
            }else {
                int  pop = stack.pop();
                int pop2=stack.pop();
                switch (token){
                    case "+":
                        stack.push(pop+pop2);
                        break;
                    case "-":
                        stack.push(pop-pop2);
                        break;
                    case "*":
                        stack.push(pop*pop2);
                        break;
                    case "/":
                        stack.push(pop/pop2);
                        break;
                    default: break;
                }
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String token) {
       return  !("+".equals(token)||"-".equals(token)||"*".equals(token)||"/".equals(token));
    }
}
