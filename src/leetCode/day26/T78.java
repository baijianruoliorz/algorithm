package leetCode.day26;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/2 -13:22
 */
public class T78 {
    class Solution{
        public List<List<Integer>> subsets(int[] nums){
            List<List<Integer>> ans=new ArrayList<>();
            getAns(nums,0,new ArrayList<>(),ans);
            return ans;
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
}
