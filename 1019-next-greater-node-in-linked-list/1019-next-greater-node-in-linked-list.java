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
    public int[] nextLargerNodes(ListNode head) {
        ListNode p=head;
      ///  ListNode q=head;
    List<Integer> list=new ArrayList<>();
        while(p.next!=null)
        {
            ListNode q=p.next;
            while(q!=null && p.val>=q.val )
            {
                q=q.next;
            }
            if(q==null)
            list.add(0);
            else
            list.add(q.val);
        p=p.next;
        }
        int i=0;
        int[] arr=new int[list.size()+1];
        for(int l:list)
        {
            arr[i++]=l;
        }
        return arr;
    }
}