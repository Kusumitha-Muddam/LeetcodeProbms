class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null;

        ListNode p = head;
        ListNode q = head;

        while (p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }

        if (p.next != null) {
            q = q.next;
        }

        // q is the middle node
        // Need previous node to delete it
        ListNode prev = head;

        while (prev.next != q) {
            prev = prev.next;
        }

        prev.next = q.next;

        return head;
    }
}