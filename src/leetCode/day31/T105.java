package leetCode.day31;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/6 -10:07
 */
public class T105 {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        return buildTreeHelper(preorder,0,preorder.length,inorder,0,inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int in_start, int in_end) {
        if (p_end==0){
            return null;
        }
        int root_val = preorder[p_start];
        TreeNode root=new TreeNode(root_val);
        int i_root_index=0;
        for (int i=in_start;i<in_end;i++){
            if (root_val==inorder[i]){
                i_root_index=i;
                break;
            }
        }
        int leftNum=i_root_index-in_start;
        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, in_start, i_root_index);
        root.right = buildTreeHelper(preorder, p_start + 1+leftNum, p_end, inorder , i_root_index+1,in_end);
        return root;
    }
}
