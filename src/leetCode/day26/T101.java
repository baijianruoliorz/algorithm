package leetCode.day26;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/2 -22:05
 */
public class T101 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null || root.right == null && root.left == null) {
                return true;
            }
            return dfs(root.left, root.right);


        }

        boolean dfs(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            return dfs(left.left, right.right) && dfs(left.right, right.left);
        }
    }
}
