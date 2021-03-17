package leetcodeReview.reviewSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/17 -11:19
 */
public class T78 {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        int length = nums.length;
        getAns(nums,0,length,res,new LinkedList<Integer>());
        return res;
    }

    private void getAns(int[] nums, int start, int length, List<List<Integer>> res, LinkedList<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i=start;i<length;i++){
            path.add(nums[i]);
            getAns(nums,i+1,length,res,path);
            path.removeLast();
        }
    }
}
