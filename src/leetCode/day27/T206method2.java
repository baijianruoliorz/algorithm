package leetCode.day27;

import leetCode.day4.ListNode;

import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -14:58
 */
public class T206method2 {
     public ListNode reverseList(ListNode head){
         if (head==null||head.next==null){
             return head;
         }
         ListNode p=reverseList(head.next);
         head.next.next=head;
         head.next=null;
         return p;
     }
}
