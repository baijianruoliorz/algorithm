package leetCode.t38;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/5 -16:32
 */
public class T46 {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> permutes=new ArrayList<>();
        List<Integer> permuteList = new ArrayList<>();
        boolean[] hasVisited=new boolean[nums.length];
        backtracking(permuteList,permutes,hasVisited,nums);
        return permutes;
    }

    private void backtracking(List<Integer> permuteList, List<List<Integer>> permutes, boolean[] hasVisited, int[] nums) {
        if (permuteList.size()==nums.length){
            permutes.add(new ArrayList<>(permuteList));
            return;
        }
        for (int i=0;i<hasVisited.length;i++){
            if (hasVisited[i]){
                continue;
            }
            hasVisited[i]=true;
            permuteList.add(nums[i]);
            backtracking(permuteList,permutes,hasVisited,nums);
            permuteList.remove(permuteList.size()-1);
            hasVisited[i]=false;
        }
    }
}
