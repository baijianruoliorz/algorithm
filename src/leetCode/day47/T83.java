package leetCode.day47;

import leetCode.day4.ListNode;

import javax.swing.*;

/**
 * @author liqiqi_tql
 * @date 2021/4/17 -19:52
 */
public class T83 {
    public ListNode deleteDuplicates(ListNode head){
        ListNode cur=head;
        while (cur!=null&&cur.next!=null){
            if (cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }
        return head;
    }
}
