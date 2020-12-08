package leetCode.day4;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -14:26
 */
public class T19 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode fast=head;
        while (n-->0){
            fast=fast.next;
        }
        if (fast==null) {
            return head.next;
        }
        ListNode slow=head;
        while (fast.next != null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
