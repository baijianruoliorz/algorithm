package leetCode.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/12/24 -9:39
 */
public class T47 {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> permutes=new ArrayList<>();
        List<Integer> permuteList=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] hasVisited=new boolean[nums.length];
        backtracking(permuteList,permutes,hasVisited,nums);
        return permutes;
    }
    private void backtracking(List<Integer> permutelist,List<List<Integer>> permutes,boolean[] visited,final  int[] nums){
        if (permutelist.size()==nums.length){
            permutes.add(new ArrayList<>(permutelist));
            return;
        }
        for (int i=0;i<visited.length;i++){
            if (i!=0&&nums[i]==nums[i-1]&&visited[i-1]){
                continue;
            }
            if (visited[i]){
                continue;
            }
            visited[i]=true;
            permutelist.add(nums[i]);
            backtracking(permutelist,permutes,visited,nums);
            permutelist.remove(permutelist.size()-1);
            visited[i]=false;
        }
    }
}
