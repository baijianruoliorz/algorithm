package leetCode.day19;

/**
 * @author liqiqi_tql
 * @date 2021/2/19 -17:49
 */
public class T21 {

        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            } else if (l2 == null) {
                return l1;
            } else if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }

        }

    public static void main(String[] args) {

        ListNode listNode3 = new ListNode(11,null);
        ListNode listNode2 = new ListNode(7,listNode3);
        ListNode listNode1 = new ListNode(3,listNode2);
        ListNode listNode6 = new ListNode(12,null);
        ListNode listNode5 = new ListNode(6,listNode6);
        ListNode listNode4 = new ListNode(5,listNode5);
        //ListNode listNode = mergeTwoLists(listNode1, listNode4);
        System.out.println(listNode1);
        System.out.println(listNode1);
        System.out.println(listNode4);
    }


}
 class ListNode{
    int val;
    ListNode next;
    ListNode(){};

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}'+next.val+' '+next.next.val+" "+next.next.next.val+" "+next.next.next.next.val;
    }
}


