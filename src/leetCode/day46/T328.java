package leetCode.day46;

import leetCode.day4.ListNode;

import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2021/4/15 -19:00
 */
public class T328 {
    public ListNode oddEvenList(ListNode head){
        if (head==null){
            return head;
        }
        ListNode odd=head,even=head.next,evenHead=even;
        while (even!=null&&even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
