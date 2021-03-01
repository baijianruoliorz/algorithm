package leetCode.day25;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/1 -21:01
 */
public class T543 {
    class Solution{
        int ans;
        public int diameterOfBinaryTree(TreeNode root){
            ans=1;
            depth(root);
            return ans-1;
        }
        public int depth(TreeNode node){
            if (node==null){
                return 0;
            }
            int L=depth(node.left);
            int R=depth(node.right);
            ans=Math.max(ans,L+R+1);
            return Math.max(L,R)+1;
        }
    }
}
