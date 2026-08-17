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
    public void reorderList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode p=head;
        while(p!=null)
        {
            list.add(p.val);
            p=p.next;
        }
        ListNode k=new ListNode();
        ListNode p1=k;
        int i=0,j=list.size()-1;
        while(i<=j)
        {
            k.next=new ListNode(list.get(i++));
            k=k.next;
            if(i<=j){
            k.next=new ListNode(list.get(j--));
            k=k.next;}
        }
        p=head;
        p1=p1.next;
        while(p!=null)
        {
          p.val=p1.val;
          p=p.next;
          p1=p1.next;
        }
            }
}