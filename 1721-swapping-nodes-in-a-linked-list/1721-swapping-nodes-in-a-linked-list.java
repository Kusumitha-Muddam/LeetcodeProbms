/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       ListNode p=head;
       ListNode q=head;
       int count=1;
      int c=1;
        while(count<k)
        {
            p=p.next;
            count++;
        } 
        while(q!=null)
        {
            c++;
            q=q.next;
        }
        q=head;
        while(c-k-1>0)
        {
            q=q.next;
            c--;
        }
        int temp=p.val;
        p.val=q.val;
        q.val=temp;
        return head;
    }
}