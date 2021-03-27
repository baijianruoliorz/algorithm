package leetcodeReview.review6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/27 -10:29
 */
public class T239 {
    public int[] maxSlidingWindow(int[] nums,int k){
        LinkedList<Integer> linkedList=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        int length = nums.length;
        for (int i=0;i<length;i++){
            if (linkedList.size()<=k){
                linkedList.add(nums[i]);
                if (linkedList.size()==k){
                    int max=Integer.MIN_VALUE;
                    for (int imax:linkedList){
                        max=Math.max(max,imax);
                    }
                    list.add(max);
                    linkedList.removeFirst();
                }
            }
        }
        Integer[] integers = list.toArray(new Integer[list.size()]);
        int[] res=new int[list.size()];
        int num=0;
        for (int i:integers){
            res[num++]=i;
        }
        return res;
        }
}
