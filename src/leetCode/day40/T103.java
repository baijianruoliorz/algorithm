package leetCode.day40;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author liqiqi_tql
 * @date 2021/4/11 -15:12
 */
public class T103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if (root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean leftToRight=true;
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int count=queue.size();
            for(int i=0;i<count;i++){
                TreeNode node = queue.poll();
                if (leftToRight){
                level.add(node.val);
                }else {
                    level.add(0,node.val);
                }
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(level);
            leftToRight=!leftToRight;
        }
        return res;
    }
}
