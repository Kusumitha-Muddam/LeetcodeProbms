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
    public int getDecimalValue(ListNode head) {
     //  List<Integer> list=new ArrayList<>();
     String n="";
       ListNode p=head;
       while(p!=null)
       {
        n+=p.val;
        p=p.next;
       }
       int ans=0,k=0;
     for(int i=n.length()-1;i>=0;i--)
       {
        int r=n.charAt(i)-'0';
        ans+=r*Math.pow(2,k);
        k++;
       // n/=10;
       }
       return ans;
    }
}