package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/21 -15:33
 */
public class T112 {
    public boolean hasPathSum(TreeNode root,int targetSum){
       if (root==null){
           return false;
       }
       if (root.left==null&&root.right==null){
           return targetSum==root.val;
       }
       return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
    }
}
