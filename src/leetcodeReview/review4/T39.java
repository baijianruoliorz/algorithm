package leetcodeReview.review4;

import leetCode.day29.list;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/10 -17:33
 */
public class T39 {
     public List<List<Integer>> combinationSum(int[] candidates,int target){
         List<List<Integer>> res=new ArrayList<>();
         int length = candidates.length;
         if (candidates.length==0){
             return res;
         }

         backTrack(res,candidates,target,new ArrayDeque<>(),0,length);
         return res;
     }

    private void backTrack(List<List<Integer>> res, int[] candidates, int target, Deque<Integer> list, int begin,int len) {
         if (target<0){
             return;
         }
        if (target==0){
            res.add(new ArrayList<>(list));
        }
        for (int i=begin;i<len;i++){
            list.add(candidates[i]);
            backTrack(res,candidates,target-candidates[i],list,i,len);
            list.remove(list.size()-1);
        }
    }
}
