package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/27 -22:01
 */
public class Tj27 {
    public TreeNode mirrorTree(TreeNode root){
        if (root==null){
            return root;
        }
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
