// Link
// https://leetcode.com/submissions/detail/718983240/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
         while (fast != null && fast.next != null)  {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
// Alternative
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        
        temp = head;
        for(int i = 0; i < len / 2; i++)
            temp = temp.next;
        
        return temp;
    }
}