package leetCode.day14;

/**
 * @author liqiqi_tql
 * @date 2020/12/28 -20:40
 */
public class J55 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public boolean isBalanced(TreeNode root){
        return recur(root)!=-1;
    }
    private int recur(TreeNode root){
        if(root==null) {
            return 0;
        }
        int left=recur(root.left);
        if (left==-1){
            return -1;
        }
        int right=recur(root.right);
        if (right==-1){
            return -1;
        }
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }

}
