package leetCode.day36;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/26 -11:36
 */
public class T2 {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode l3=reverseList(l1);
        ListNode l4 = reverseList(l2);
        int sum1=0;
        int sum2=0;
        while (l3!=null){
            if (sum1!=0){
                sum1*=10;
            }
            sum1+=l3.val;
            l3=l3.next;
        }
        while (l4!=null){
            if (sum2!=0){
                sum2*=10;
            }
            sum2+=l4.val;
            l4=l4.next;
        }
        ListNode list=new ListNode(0);
        ListNode pre=list;
        int sum3=sum1+sum2;
        while (sum3>0){
            int s=sum3%10;
            pre.next=new ListNode(s);
            sum3/=10;
        }
        return pre.next;

    }
    public ListNode reverseList(ListNode root){
        if (root==null){
            return root;
        }
        ListNode cur=root;
        ListNode pre=null;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
