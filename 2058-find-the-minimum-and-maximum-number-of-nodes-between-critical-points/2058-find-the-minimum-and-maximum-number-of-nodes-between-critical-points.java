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
 import java.util.Arrays;
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[]=new int[2];
        List<Integer> list=new ArrayList<>();
        ListNode nex=head.next;
        ListNode curr=head;
        ListNode prev=head;
        int ind=1;
        while(nex.next!=null)
        {
           prev=curr;
           curr=nex;
           nex=nex.next;
           if((curr.val>prev.val && curr.val>nex.val)||(curr.val<prev.val && curr.val<nex.val))
           list.add(ind);
           ind++;

        }
        System.out.print(list);
        if(list.size()<2)
        {
            Arrays.fill(arr,-1);
            return arr;
        }
        int[] a= new int[list.size()];
int min=Integer.MAX_VALUE;
for (int i = 0; i < list.size(); i++) {
    a[i] = list.get(i);
}
for (int i = 0; i < list.size()-1; i++) {
min=Math.min(min,a[i+1]-a[i]);
}
//Arrays.sort(a);
arr[1]=a[list.size()-1]-a[0];
arr[0]=min;
return arr;
    }
}