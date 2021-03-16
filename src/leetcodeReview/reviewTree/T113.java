package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/16 -9:31
 */
public class T113 {
    LinkedList<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        rootSum(root,sum);
        return res;
    }

    private void rootSum(TreeNode root, int target) {
        if (root==null){
            return;
        }
        path.add(root.val);
        if (target-root.val==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(path));
        }
        rootSum(root.left,target-root.val);
        rootSum(root.right,target-root.val);
        path.removeLast();
    }
}
