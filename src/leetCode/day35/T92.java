package leetCode.day35;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/18 -8:55
 */
public class T92 {
    public ListNode reverseBetween(ListNode head,int left,int right){
        ListNode pre=head;
        int num=0;
        while (num!=left){
            pre=pre.next;
            num++;
        }
        ListNode cur=null;
        while (num!=right){
            ListNode ans=pre.next;
            pre.next=cur;
            cur=pre;
            pre=ans;
            num++;
        }
        return cur;
    }
}
