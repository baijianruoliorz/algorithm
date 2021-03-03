package leetCode.day27;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/3 -14:55
 */
public class T206 {
    public ListNode reverseList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
