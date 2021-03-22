package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/22 -9:10
 */
public class T100 {
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null&&q==null){
            return true;
        }
        if (p==null||q==null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
