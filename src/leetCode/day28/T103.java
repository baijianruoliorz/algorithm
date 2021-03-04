package leetCode.day28;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -20:48
 */
public class T103 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> linkedList = new ArrayList<>();
            ;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (!flag) {
                    linkedList.add(poll.val);
                } else {
                    linkedList.add(0, poll.val);
                }
                if (poll.left != null) {
                    queue.add(poll.right);
                }
                if (poll.right != null) {
                    queue.add(poll.left);
                }
            }
            flag = !flag;
            res.add(linkedList);

        }
        return res;
    }
}
