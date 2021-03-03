package leetCode.day27;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -9:43
 */
public class T104 {
    public int maxDepth(TreeNode node){
    if (node==null){
        return 0;
    }
    int left=maxDepth(node.left);
    int right=maxDepth(node.right);
    return Math.max(left,right)+1;
    }

}
