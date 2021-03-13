package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/12 -15:36
 */
public class T61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        int num=1;
        while (cur.next!= null) {
            cur = cur.next;
            num++;
        }
        cur.next = head;
        ListNode res=head;
       for (int i=0;i<num-k%num-1;i++){
           res=res.next;
       }
       head=res.next;
       res.next=null;
       return head;
    }
}
