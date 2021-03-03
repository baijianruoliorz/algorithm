package leetCode.day27;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -11:44
 */
public class T107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        LinkedList<List<Integer>> res=new LinkedList<>();
        while (root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> list=new LinkedList<>();

            for (int i=0;i<size;i++){
                TreeNode poll = queue.poll();
                list.addFirst(poll.val);
                if (poll.right!=null){
                    queue.add(poll.right);
                }
                if (poll.left!=null){
                    queue.add(poll.left);
                }
            }
            res.addFirst(list);
        }

        return res;
    }

}
