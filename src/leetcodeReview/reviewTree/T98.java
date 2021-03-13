package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/12 -16:26
 */
public class T98 {
    long pre=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root){
        if (root==null){
            return true;
        }
        if (!isValidBST(root.left)){
            return false;
        }
        if (root.val<=pre){
            return false;
        }
        pre=root.val;
        return isValidBST(root.right);
    }
}
