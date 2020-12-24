package leetCode.day9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/12/24 -9:30
 */
public class T46 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> permutes=new ArrayList<>();
        List<Integer> permuteList=new ArrayList<>();
        boolean[] hasVisited=new boolean[nums.length];
        backtracking(permuteList,permutes,hasVisited,nums);
        return permutes;
    }

    private void backtracking(List<Integer> permuteList,List<List<Integer>> permutes,boolean[] visited,final int[]nums){
        if (permuteList.size()==nums.length){
            permutes.add(new ArrayList<>(permuteList));
            return;
        }
        for (int i=0;i<visited.length;i++){
            if (visited[i]){
                continue;
            }
            visited[i]=true;
            permuteList.add(nums[i]);
            backtracking(permuteList,permutes,visited,nums);
            permuteList.remove(permuteList.size()-1);
            visited[i]=false;
        }
    }
}
