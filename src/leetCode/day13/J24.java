package leetCode.day13;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2020/12/26 -19:59
 */
public class J24 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){this.val=x;}
    }
 public ListNode reverseList(ListNode head){
     ListNode cur=head,pre=null;
     while (cur!=null){
         ListNode tmp=cur.next;
         cur.next=pre;
         pre=cur;
         cur=tmp;
     }
     return pre;
 }
}
