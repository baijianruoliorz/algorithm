package leetcodeReview.reviewSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/17 -10:49
 */
public class T39 {
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        int len=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
        if (len==0){
            return res;
        }
        Deque<Integer> path=new ArrayDeque<>();
        dfs(candidates,0,len,target,path,res);
        return res;
    }

    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(path));
        }
        for (int i=begin;i<len;i++){
            path.addLast(candidates[i]);
            dfs(candidates,i,len,target-candidates[i],path,res);
            path.removeLast();
        }
    }
}
