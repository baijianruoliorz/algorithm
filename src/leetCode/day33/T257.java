package leetCode.day33;

import leetCode.day5.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/10 -21:08
 */
public class T257 {
    public List<String> binaryTreePaths(TreeNode root){
       List<String> res=new ArrayList<>();
       dfs(root,"",res);
       return res;
    }

    private void dfs(TreeNode root, String path, List<String> res) {
        if (root==null){
            return;
        }
        if (root.left==null&&root.right==null){
            res.add(path+root.val);
            return;
        }
        dfs(root.left,path+root.val+"->",res);
        dfs(root.right,path+root.val+"->",res);
    }
}
