package leetCode.day41;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/4/12 -9:10
 */
public class T108 {
    public TreeNode sortedArrayToBST(int[] nums){
        return dfs(nums,0,nums.length-1);
    }

    private TreeNode dfs(int[] nums, int lo, int hi) {
        if(lo>hi){
            return null;
        }
        int mid=(hi-lo)/2+lo;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=dfs(nums,lo,mid-1);
        root.right=dfs(nums,mid+1,hi);
        return root;
    }
}
