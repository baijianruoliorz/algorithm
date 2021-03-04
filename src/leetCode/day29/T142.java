package leetCode.day29;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/4 -10:21
 */
public class T142 {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        while (true) {
            if (p==null||p.next==null){
                return null;
            }
            p = p.next.next;
            q = q.next;
            if (p == q) {
                break;
            }
        }
        p = head;
        while (p != q) {
            q=q.next;
            p = p.next;
        }
        return p;

    }
}
