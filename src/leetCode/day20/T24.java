package leetCode.day20;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/2/20 -21:04
 */
public class T24 {
    class Solution{
        public ListNode sqapPairs(ListNode head){
            ListNode pre=new ListNode(0);
            pre.next=head;
            ListNode temp=pre;
            while (temp.next!=null&&temp.next.next!=null){
                ListNode start=temp.next;
                ListNode end=temp.next.next;
                temp.next=end;
                start.next=end.next;
                end.next=start;
                temp=start;
            }
            return pre.next;
        }
    }
}
