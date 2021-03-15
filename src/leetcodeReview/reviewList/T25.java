package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/15 -14:09
 */
public class T25 {
    public ListNode reverseKGroup(ListNode head,int k){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode end=dummy;
        while (end.next!=null){
            for (int i=0;i<k&&end!=null;i++) {
                end = end.next;
            }
                if (end==null) {
                    break;
                }
                ListNode start=pre.next;
                ListNode next=end.next;
                end.next=null;
                pre.next=reverse(start);
                start.next=next;
                pre=start;
                end=pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}
