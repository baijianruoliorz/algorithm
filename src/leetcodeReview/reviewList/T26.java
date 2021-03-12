package leetcodeReview.reviewList;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * @author liqiqi_tql
 * @date 2021/3/12 -15:16
 */
public class T26 {
    public int removeDuplicates(int[] nums){
        int length = nums.length;
        if (length ==0||nums==null){
            return 0;
        }
       int p=0,q=1;
        while (q<length){
            if (nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
