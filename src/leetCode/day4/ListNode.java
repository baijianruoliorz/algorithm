package leetCode.day4;

/**
 * @author liqiqi_tql
 * @date 2020/12/8 -14:07
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x){
        val=x;
    }
    public ListNode(int x,ListNode head){
        this.next=head;
        this.val=x;
    }
    public ListNode(ListNode head){
        this.next=head;
    }

}
