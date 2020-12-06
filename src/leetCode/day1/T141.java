package leetCode.day1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liqiqi_tql
 * @date 2020/12/5 -13:49
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val =x;
        next=null;
    }
}
public class T141 {
public boolean hasCycle(ListNode head) {
    Set<ListNode> seen = new HashSet<>();
    while (head!=null){
        if (!seen.add(head)){
            return true;
        }
        head=head.next;
    }
    return false;
}
}
