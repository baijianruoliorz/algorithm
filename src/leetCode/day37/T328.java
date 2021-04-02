package leetCode.day37;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/4/2 -14:25
 */
public class T328 {
    public ListNode oddEvenList(ListNode head){
        if (head==null){
            return head;
        }
        ListNode cur=head,even=head.next,evenHead=even;
        while (even!=null&&even.next!=null){
            cur.next=cur.next.next;
            cur=cur.next;
            even.next=even.next.next;
            even=even.next;
        }
        cur.next=evenHead;
        return head;
    }
}

