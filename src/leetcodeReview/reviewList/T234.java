package leetcodeReview.reviewList;

import leetCode.day4.ListNode;

/**
 * @author liqiqi_tql
 * @date 2021/3/22 -14:46
 */
public class T234 {
    class Solution{
        public boolean isPalindrome(ListNode head){
            int len=0,i=0;
            ListNode dummy=head;
            while (head!=null){
            head=head.next;
            len++;
            }
            int[] ans=new int[len];
            while (dummy!=null) {
                ans[i++] = dummy.val;
                dummy = dummy.next;
            }
           return isPalind(ans,0,len);
        }

        private boolean isPalind(int[] ans,int start, int len) {
            while (start<len-1){
                if (ans[start]!=ans[len-1]){
                    return false;
                }
                start++;
                len--;
            }
            return true;
        }
    }
}
