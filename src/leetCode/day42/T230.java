package leetCode.day42;

import leetCode.day5.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -20:24
 */
public class T230 {
    int k,res;
    public int kthSmallest(TreeNode root,int k){
        this.k=k;
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root==null){
            return;
        }
        helper(root.left);
        if (k==0){
            return;
        }
        k--;
        if (k==0){
            res=root.val;
        }
        helper(root.right);
    }
}
