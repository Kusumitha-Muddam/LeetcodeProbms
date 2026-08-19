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
    public ListNode mergeNodes(ListNode head) {
        ListNode list=new ListNode();
        ListNode q=list;
       ListNode p=head.next;
       int s=0;
       while(p!=null)
       {
        if(p.val!=0)
        {
            s+=p.val;
        }
        else
        {
            q.next=new ListNode(s);
            q=q.next;
            s=0;
        }
        p=p.next;
       }
return list.next;
    }
}