package leetCode.day4;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -14:09
 */
public class T206 {
    public ListNode reverseList(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        ListNode newHead=reverseList(next);
        next.next=head;
        head.next=null;
        return newHead;
    }
}
