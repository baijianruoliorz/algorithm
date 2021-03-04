package leetCode.day29;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/4 -9:35
 */
public class T236 {
    private TreeNode ans;
    private boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if (root==null){
            return false;
        }
        boolean lson = dfs(root.right, p, q);
        boolean rson = dfs(root.left, p, q);
        if ((lson&&rson)||((root.val==p.val||root.val==q.val))&&(lson||rson)) {
            ans=root;
        }
        return lson||rson||(root.val==p.val||root.val==q.val);
    }

    public TreeNode lowestComminAncestor(TreeNode root,TreeNode p,TreeNode q){
        dfs(root, p, q);
        return ans;

    }
}
