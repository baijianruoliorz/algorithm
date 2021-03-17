package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;

/**
 * @author liqiqi_tql
 * @date 2021/3/13 -15:49
 */
public class T101 {
    public boolean isSymmetric(TreeNode root){
        if (root==null||root.right==null&&root.left==null){
            return true;
        }
        return dfs(root.left,root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left==null&&right==null){
            return true;
        }
        int a=10;
        
        if (left==null||right==null){
            return false;
        }
        if (left.val!=right.val){
            return false;
        }
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
