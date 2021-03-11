package leetcodeReview.review4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/11 -10:23
 */
public class T46 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> permutes=new ArrayList<>();
        List<Integer> permuteList=new ArrayList<>();
        boolean[] hasVisited=new boolean[nums.length];
        backtracking(permuteList,permutes,hasVisited,nums,0);
        return permutes;
    }

    private void backtracking(List<Integer> permuteList,List<List<Integer>> permutes,boolean[] visited,final int[]nums,int start){
        if (permuteList.size()==nums.length){
            permutes.add(new ArrayList<>(permuteList));
            return;
        }
        for (int i=start;i<visited.length;i++){

            permuteList.add(nums[i]);
            backtracking(permuteList,permutes,visited,nums,start+1);
            permuteList.remove(permuteList.size()-1);
        }


    }
}
