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
 import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
     List<Integer> list=new ArrayList<>();
     ListNode p=head;
     ListNode q=head;
     while(p!=null)
     {
        list.add(p.val);
        p=p.next;
     }  
     Collections.sort(list);
     int i=0;
       while(q!=null)
     {
       q.val=list.get(i);
        q=q.next;i++;
     }
     return head;
    }
   
   
}