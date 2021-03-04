package leetCode.day29;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/4 -10:47
 */
public class inverseK {
    public ListNode getKthFromEnd(ListNode head,int k){
        ListNode q=head,p=head;
        while (k>0){
            q=q.next;
            k--;
        }
        while (q!=null){
            p=p.next;
            q=q.next;
        }
        return q;
    }
}
