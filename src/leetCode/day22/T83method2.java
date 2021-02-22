package leetCode.day22;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/2/22 -15:21
 */
public class T83method2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while(cur != null && cur.next != null) {
                if(cur.val == cur.next.val) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return head;
        }
    }
}
