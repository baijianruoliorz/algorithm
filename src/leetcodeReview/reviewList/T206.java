package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/15 -9:51
 */
public class T206 {
    public ListNode reverseList(ListNode head){
        ListNode cur=head,pre=null;
        while (cur!=null){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
}
