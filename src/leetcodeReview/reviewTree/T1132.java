package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/21 -16:05
 */
public class T1132 {
    public List<List<Integer>> pathSum(TreeNode root,int targetSum){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        if (root==null){
            return res;
        }
        dfs(res,path,targetSum,root);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> path, int targetSum,TreeNode root) {
        if (targetSum==0){
            res.add(new ArrayList<>(path));
        }
        if (targetSum<0){
            return;
        }
        if (root!=null) {
            path.add(root.val);
        }
        if (root.left!=null) {
            dfs(res, path, targetSum - root.val, root.left);
        }
        if (root.right!=null) {
            dfs(res, path, targetSum - root.val, root.right);
        }
        path.remove(path.size()-1);
    }
}
