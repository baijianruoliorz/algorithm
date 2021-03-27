package leetcodeReview.review6;

import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2021/3/27 -10:08
 */
public class T42Method2 {
    public int trap(int[] height){
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        int current=0;
        while (current<height.length){
            while (!stack.empty()&&height[current]>height[stack.peek()]){
                int h=height[stack.peek()];
                stack.pop();
                if (stack.empty()){
                    break;
                }
                int distance=current-stack.peek()-1;
                int min=Math.min(height[stack.peek()],height[current]);
                sum=sum+distance*(min-h);
            }
            stack.push(current);
            current++;
        }
        return sum;
    }
}
