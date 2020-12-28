package leetCode.day15;



/**
 * @author liqiqi_tql
 * @date 2020/12/28 -11:30
 */
public class T236 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    private TreeNode ans;
    private boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if (root==null) {
            return false;
        }
        boolean lson=dfs(root.left,p,q);
        boolean rson=dfs(root.right,p,q);
        if ((lson&&rson)||((root.val==p.val||root.val==q.val)&&(lson||rson))){
            ans=root;
        }
        return lson||rson||(root.val==p.val||root.val==q.val);
    }
    public TreeNode lowestComminAncestor(TreeNode root,TreeNode p,TreeNode q){
        this.dfs(root,p,q);
        return this.ans;
    }

}
