package leetcodeReview.reviewSearch;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/17 -10:53
 */
class T40 {
    public List<List<Integer>> combinationSum2(int[] candidates,int target){
        List<List<Integer>> res=new ArrayList<>();
        int length = candidates.length;
        if (length==0){
            return res;
        }
        Arrays.sort(candidates);

        dfs(candidates,0,length,target,new ArrayDeque<Integer>(),res);
        return res;
    }

    private void dfs(int[] candidates, int start, int length, int target, ArrayDeque<Integer> path, List<List<Integer>> res) {
        if (target<0){
            return;
        }
        if (target==0){
            res.add(new ArrayList<>(path));
        }
        for (int i=start;i<length;i++){
            if (i>start&&candidates[i]==candidates[i-1]){
                continue;
            }
            path.addLast(candidates[i]);
            dfs(candidates,i+1,length,target-candidates[i],path,res);
            path.removeLast();
        }
    }
}
