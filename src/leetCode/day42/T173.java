package leetCode.day42;

import leetCode.day5.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/13 -20:37
 */
public class T173 {
    class BSTIterator{
      Deque<TreeNode> d=new ArrayDeque<>();
      public BSTIterator(TreeNode root){
          dfsLeft(root);
      }
      public int next(){
          TreeNode root=d.pollLast();
          int ans=root.val;
          root=root.right;
          dfsLeft(root);
          return ans;
      }

        private void dfsLeft(TreeNode root) {
          while (root!=null){
              d.add(root);
              root=root.left;
          }
        }
        public boolean haxNext(){
          return !d.isEmpty();
        }
    }
}
