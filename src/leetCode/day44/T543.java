package leetCode.day44;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/4/14 -22:22
 */
public class T543 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root){
        ans=1;
        depth(root);
        return ans-1;
    }

    private int depth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int left=depth(root.left);
        int right = depth(root.right);
        ans=Math.max(ans,right+left+1);
        return Math.max(left,right)+1;
    }
}
