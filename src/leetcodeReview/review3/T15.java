package leetcodeReview.review3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/8 -16:08
 */
public class T15 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        for (int i=0;i<len;i++){
            if (nums[i]>0){
                return lists;
            }
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int cur=nums[i];
            int L=i+1,R=len-1;
            while (L<R){
                int tmp=cur+nums[R]+nums[L];
                if (tmp==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(cur);
                    list.add(nums[R]);
                    list.add(nums[L]);
                    lists.add(list);
                    while (L<R&&nums[L+1]==nums[L]) {
                        L++;
                    }
                    while (L<R&&nums[R-1]==nums[R]){
                        R--;
                    }
                    ++L;
                    --R;
                }else if (tmp<0){
                    ++L;
                }else {
                    --R;
                }
            }
        }
        return lists;
    }
}
