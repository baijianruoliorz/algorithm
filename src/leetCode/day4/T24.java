package leetCode.day4;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -21:41
 */
public class T24 {
   public ListNode swapParis(ListNode head){
       ListNode node=new ListNode(-1);
       node.next=head;
       ListNode pre=node;
       while (pre.next!=null&&pre.next.next!=null){
           ListNode l1=pre.next,l2=pre.next.next;
           ListNode next=l2.next;
           l1.next=next;
           l2.next=l1;
           pre.next=l2;
           pre=l1;
       }
       return node.next;
   }
}
