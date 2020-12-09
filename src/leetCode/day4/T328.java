package leetCode.day4;

import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/12/9 -11:09
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
