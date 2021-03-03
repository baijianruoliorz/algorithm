package leetCode.day23;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -11:36
 */
public class T252Method2 {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if (root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=0;i<n;i++){
                TreeNode node=queue.poll();
                list.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
