// Link
// https://leetcode.com/submissions/detail/718988280/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
// Alternative
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(fast.next != null){
            fast = fast.next;
            if(n-- <= 0)
                slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}