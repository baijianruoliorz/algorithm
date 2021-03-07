package leetcodeReview.review2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -15:07
 */
public class T46 {

    public List<List<Integer>> premute(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n= nums.length;
        backtrack(n,output,res,0);
        return res;

    }

    private void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        if (first==n){
            res.add(new ArrayList<>(output));
        }

        for (int i=first;i<n;i++){
//            动态维护一个数组
            Collections.swap(output,first,i);
            backtrack(n,output,res,first+1);
            Collections.swap(output,first,i);
        }
    }

}
