package leetCode.day33;

import leetCode.day5.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/10 -20:38
 */
public class TM34 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        rootSum(root, sum);
        return res;
    }

    void rootSum(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (target - root.val == 0 && root.left == null && root.right == null) {
//            以后必须写成这种格式
            res.add(new LinkedList<>(path));
        }
        rootSum(root.left, target - root.val);
        rootSum(root.right, target - root.val);
        path.removeLast();


    }
}
