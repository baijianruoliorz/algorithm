package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author liqiqi_tql
 * @date 2021/3/12 -11:55
 */
public class T23 {
    public ListNode mergeKLists(ListNode[] lists){
     if (lists==null||lists.length==0){
         return null;
     }
     PriorityQueue<ListNode> queue=new PriorityQueue<>(lists.length,(o1,o2)->{
         return o1.val-o2.val;
     });
     ListNode dummy=new ListNode(0);
     ListNode p=dummy;
        for (ListNode list : lists) {
            if (list!=null){
                queue.add(list);
            }
        }
        while (!queue.isEmpty()){
            p.next=queue.poll();
            p=p.next;
            if (p.next!=null){
                queue.add(p.next);
            }
        }
        return dummy.next;
    }
}
