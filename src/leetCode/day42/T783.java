package leetCode.day42;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -21:10
 */
public class T783 {
    int pre=0;
    int num=0;
    int end=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root){
        inOrder(root);
        return end;
    }
    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        if (num==0) {
            pre = root.val;
        }
        if (num!=0) {
            end = Math.min(end,root.val-pre);
        }
        pre=root.val;
        num++;
        inOrder(root.right);
    }


}
