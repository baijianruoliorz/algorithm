package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/12 -11:33
 */
public class T19 {
    public ListNode removeNthFromEnd(ListNode head,int n){
         ListNode dummy=new ListNode(head);
        int len= getLength(head);
        for (int i=0;i<len-n;i++){
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
        return head;
    }

    private int getLength(ListNode head) {
        int length=0;
        while (head!=null){
            length++;
            head=head.next;
        }
        return length;
    }

}
