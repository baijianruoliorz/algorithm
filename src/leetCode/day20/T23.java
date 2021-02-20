package leetCode.day20;

import leetCode.day4.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author liqiqi_tql
 * @date 2021/2/20 -20:04
 */
public class T23 {
    class Solution{
        public ListNode mergeKLists(ListNode[] lists){
            if (lists==null||lists.length==0) {
                return null;
            }
            PriorityQueue<ListNode> queue=new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    if (o1.val<o2.val) {
                        return -1;
                    } else if (o1.val==o2.val) {
                        return 0;
                    }else {
                        return 1;
                    }
                }
            });
            ListNode dummy=new ListNode(0);
            ListNode p=dummy;
            for (ListNode list : lists) {
                if (list!=null) {
                    queue.add(list);
                }
            }
            while (!queue.isEmpty()){
            p.next=queue.poll();
            p=p.next;
            if (p.next!=null) {
                queue.add(p.next);
            }
            }
            return dummy.next;
        }
    }
}
