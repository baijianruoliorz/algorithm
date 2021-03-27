package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/18 -10:40
 */
public class T111 {
   public int minDepth(TreeNode root){
       if (root==null){
           return 0;
       }
       if (root.left==null&&root.left==null){
           return 1;
       }
       int m1=minDepth(root.left);
       int m2=minDepth(root.right);
       if (root.left==null||root.right==null){
           return m1+m2+1;
       }
       return Math.min(m1,m2)+1;
   }
}
