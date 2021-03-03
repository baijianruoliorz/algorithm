package leetCode.day27;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -10:40
 */
public class T102 {
    List<Integer> preList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
    preOrder(root);
    int[] preNum=new int[preList.size()];
    for (int i=0;i<preList.size();i++){
        preNum[i]=preList.get(i);
    }
    List<List<Integer>> preListOrder = new ArrayList<>();
       return preListOrder;
    }
//
    public void preOrder(TreeNode node){
        if (node==null){
            return ;
        }
        preList.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
}
