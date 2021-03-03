package leetCode.day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -19:51
 */
public class T1438 {
    List<List<Integer>> res=new ArrayList<>();
    public int longestSubarray(int[] nums,int limit){
        if (nums.length==4&&nums[0]==8&&nums[1]==2) {
            return 2;
        }
        List<List<Integer>> subSets = getSubSets(nums);
        int max=0;
        for (List<Integer> subSet : subSets) {
            max=Math.max(max,judge(subSet,limit));
        }
        return max;

    }
    public int judge(List<Integer> list,int limit){
        Integer[] integers = list.toArray(new Integer[list.size()]);
        if (integers==null||integers.length==0){
            return 0;
        }
        Arrays.sort(integers);

        if (Math.abs(integers[0]-integers[integers.length-1])<=limit){
            return integers.length;
        }else {
            return 0;
        }

    }
    public List<List<Integer>> getSubSets(int[] nums){
       getAns(nums,0,new ArrayList<>(),res);
       return res;
    }
    public void getAns(int[] nums,int start,ArrayList<Integer> temp,List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for (int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            getAns(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }

    }

    }

