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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 import java.util.*;
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
       // List<Integer> l=new ArrayList<>();
       int len=0;
       ListNode q=head;
       while(head!=null)
       {
        len++;
        head=head.next;
       }
       int []arr=new int[len];
       int i=0;
       while(q!=null)
       {
        arr[i++]=q.val;
        q=q.next;
       }

          return build(arr,0,len-1);

     }
     TreeNode build(int  []arr,int left,int right)
     {
        if(left>right)
        return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=build(arr,left,mid-1);
        root.right=build(arr,mid+1,right);
        return root;
     }
}