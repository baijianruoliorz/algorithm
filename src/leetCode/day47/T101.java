package leetCode.day47;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/4/17 -10:36
 */
public class T101 {
    public boolean isSymmetric(TreeNode root){
        if(root==null||root.right==null&&root.left==null){
            return true;
        }
        return dfs(root.left,root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        if (left==null||right
        ==null){
            return false;
        }
        if (left.val!=right.val){
            return false;
        }
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
