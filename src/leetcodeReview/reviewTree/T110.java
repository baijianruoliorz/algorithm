package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/13 -15:30
 */
public class T110 {
    public boolean isBalanced(TreeNode root){
        int i = treeHeight(root);
        return i!=-1;
    }
    public int treeHeight(TreeNode root){
        if (root==null){
            return 0;
        }
        int left=treeHeight(root.left);
        if (left==-1){
            return -1;
        }
        int right=treeHeight(root.right);
        if (right==-1){
            return -1;
        }
        return Math.abs(right-left)<2?Math.max(right,left)+1:-1;
    }
}
