package leetcodeReview.reviewTree;

import leetCode.day5.TreeNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/15 -10:39
 */
public class T105 {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        return buildTreeHelper(preorder,0,preorder.length,inorder,0,inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        if (p_start==p_end){
            return null;
        }
        int root_val=preorder[p_start];
        TreeNode root=new TreeNode(root_val);
//   在中序遍历中找到根节点这个位置
        int i_root_index=0;
        for (int i=i_start;i<i_end;i++){
            if(root_val==inorder[i]){
                i_root_index=i;
                break;
            }
        }
        int leftNum=i_root_index-i_start;
        root.left=buildTreeHelper(preorder,p_start+1,p_start+leftNum+1,inorder,i_start,i_root_index);
        root.right=buildTreeHelper(preorder,p_start+leftNum+1,p_end,inorder,i_root_index+1,i_end);
         return root;
    }
}
