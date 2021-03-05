package leetCode.day29;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/4 -11:01
 */
public class list {
    public boolean hasCycle(ListNode head){
        ListNode p=head,q=head;
        while (p!=null){
          if (p.next!=null){
              p=p.next;
          }
          if (p.next!=null){
              p=p.next;
          }
         if (p==q){
             return true;
         }
            q=q.next;
        }
        return false;
    }
}
