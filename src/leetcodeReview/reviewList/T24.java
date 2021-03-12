package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/12 -15:00
 */
public class T24 {
    public ListNode swapPairs(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
        head.next=swapPairs(next.next);
        next.next=head;
        return next;
    }
}
