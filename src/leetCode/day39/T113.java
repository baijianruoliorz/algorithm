package leetCode.day39;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/8 -21:00
 */
public class T113 {
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        List<List<Integer>> result=new ArrayList<>();
        dfs(root,sum,new ArrayList<>(),result);
        return result;
    }

    private void dfs(TreeNode root, int sum, ArrayList<Integer> list, List<List<Integer>> result) {
        if (root==null){
            return;
        }
        list.add(new Integer(root.val));
        if (root.left==null&&root.right==null){
            if (sum==root.val){
                result.add(new ArrayList<>(list));}
                list.remove(list.size()-1);
                return;

        }
        dfs(root.left, sum - root.val, list, result);
        dfs(root.right, sum - root.val, list, result);
        list.remove(list.size() - 1);
    }
}
