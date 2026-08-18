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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p=list1;
        ListNode q=list1;
        
        while( p!=null && a!=1)
        {
            p=p.next;
            a--;
        }
         while(q!=null && b!=0)
        {
            q=q.next;
            b--;
        }
        ListNode k=list1;
    p.next=list2;
    while(k.next!=null)
    {
        k=k.next;

    }
    if(q.next!=null)
    k.next=q.next;
    else
    k.next=null;
    return list1;

    }
}