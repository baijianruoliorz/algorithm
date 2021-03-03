package leetCode.day27;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -9:26
 */
public class T110 {
    public boolean isBalanced(TreeNode root){
        if (root==null){
            return true;
        }
        int right = treeHight(root.right);
        int left = treeHight(root.left);
        if (Math.abs(right-left)<=1){
            return true;
        }else {
            return false;
        }

    }
    public int treeHight(TreeNode node){
        if (node==null){
            return 0;
        }
        int nodeHightRight=treeHight(node.right);
        int nodeHightLeft=treeHight(node.left);
        return Math.max(nodeHightLeft,nodeHightRight)+1;
    }
}
