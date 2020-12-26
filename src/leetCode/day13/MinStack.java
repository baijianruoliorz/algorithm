package leetCode.day13;

import java.time.OffsetDateTime;
import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2020/12/26 -15:29
 */
//辅助栈实现最小栈
public class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> helper;
    public MinStack(){
        data=new Stack<>();
        helper=new Stack<>();
    }
    public void push(int x){
        data.add(x);
        if (helper.isEmpty()||helper.peek()>=x){
            helper.add(x);
        }else {
            helper.add(helper.peek());
        }
    }
    public void pop(){
        if (!data.isEmpty()){
            helper.pop();
            data.pop();
        }
    }
    public int top(){
        if (!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空,此操作非法");
    }
    public int getMin(){
        if (!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("栈中元素为空,此操作非法");
    }
}
