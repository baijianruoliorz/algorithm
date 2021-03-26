package leetcodeReview.reviewTree;

import leetCode.day4.ListNode;
import leetCode.day5.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/26 -11:03
 */
public class T199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> treeDeque = new ArrayDeque<>();
        treeDeque.add(root);
        while (!treeDeque.isEmpty()) {
            int size = treeDeque.size();
            List<Integer> treeList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode poll = treeDeque.poll();
                if (i == size - 1) {
                    treeList.add(poll.val);
                }
                if (poll.left != null) {
                    treeDeque.add(poll.left);
                }
                if (poll.right != null) {
                    treeDeque.add(poll.right);
                }
            }
            res.addAll(treeList);
        }
        return res;
    }
}
