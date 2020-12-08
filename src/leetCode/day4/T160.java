package leetCode.day4;


/**
 * @author liqiqi_tql
 * @date 2020/12/8 -12:19
 */
public class T160 {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode l1=headA,l2=headB;
        while (l1!=l2){
            l1=(l1==null)?headB:l1.next;
            l2=(l2==null)?headA:l2.next;
        }
        return l1;
    }

}
