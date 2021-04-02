package leetCode.day37;

import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2021/4/1 -17:34
 */
public class T503 {
    public int[] nextGreaterElements(int[] nums){
        int n=nums.length;
        int[] res=new int[n];
        for (int i=0;i<n;i++){
            res[i]=-1;
        }
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<n;i++) {

            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {

                res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        for (int i=0;i<n;i++) {

            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {

                res[stack.pop()] = nums[i];
            }
        }
        return res;
    }
}
