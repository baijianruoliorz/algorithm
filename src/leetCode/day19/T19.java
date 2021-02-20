package leetCode.day19;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author liqiqi_tql
 * @date 2021/2/19 -18:03
 */
public class T19 {

        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            int length = getLength(head);
            ListNode cur = dummy;
            for (int i = 1; i < length - n + 1; ++i) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            ListNode ans = dummy.next;
            return ans;
        }

        public static int getLength(ListNode head) {
            int length = 0;
            while (head != null) {
                ++length;
                head = head.next;
            }
            return length;
        }

    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        HashMap<String, String> hashMap=new HashMap<>();
        Stack<String> stack=new Stack<>();
        LinkedList<String> queues = new LinkedList<>();
        


        ListNode listNode6 = new ListNode(11,null);
        ListNode listNode5 = new ListNode(11,listNode6);
        ListNode listNode3 = new ListNode(11,listNode5);

        ListNode listNode2 = new ListNode(7,listNode3);
        ListNode listNode1 = new ListNode(3,listNode2);
        removeNthFromEnd(listNode1,2);
        System.out.println(listNode1);
    }

}
