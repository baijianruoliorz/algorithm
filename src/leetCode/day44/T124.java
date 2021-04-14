package leetCode.day44;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -22:25
 */
public class T124 {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root){
        if (root==null){
            return 0;
        }
        dfs(root);
        return max;
    }
    private int dfs(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));
        max=Math.max(max,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}
