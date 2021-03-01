package leetCode.day5;

/**
 * @author liqiqi_tql
 * @date 2020/12/15 -21:54
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(){}
    public TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
