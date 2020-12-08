package leetCode.day4;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -14:21
 */
public class T83 {
    public ListNode deleteDuplicates(ListNode head){
        if (head==null||head.next==null) {
            return head;
        }
        head.next=deleteDuplicates(head.next);
        return head.val==head.next.val?head.next:head;
    }
}
