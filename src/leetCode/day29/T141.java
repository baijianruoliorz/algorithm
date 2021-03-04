package leetCode.day29;

import leetCode.day4.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liqiqi_tql
 * @date 2021/3/4 -10:31
 */
public class T141 {
    public boolean hasCycle(ListNode head){
        Set<ListNode> seen=new HashSet<>();
        while (head!=null){
            if (!seen.add(head)){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}
