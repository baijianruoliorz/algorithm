package leetCode.day30;

import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2021/3/5 -9:12
 */
public class T232 {
    class MyQueue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        int front;
        public MyQueue(){
            this.stack1=new Stack<>();
            this.stack2=new Stack<>();
        }
        public void push(int x){
       if (stack1.isEmpty()){
             front=x;
         }
       while (!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }
       stack2.push(x);
       while (!stack2.isEmpty()){
           stack1.push(stack2.pop());
       }

        }
        public void pop(){
         stack1.pop();
         if (!stack1.isEmpty()){
             front=stack1.peek();
         }
        }
        public int peek(){
            return front;

        }
        public boolean empty(){
            return stack1.isEmpty();
        }
    }
}
