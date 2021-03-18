package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/18 -10:07
 */
public class T141 {
    public boolean hasCycle(ListNode head){
        if (head==null||head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (slow!=fast){
            if (fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
