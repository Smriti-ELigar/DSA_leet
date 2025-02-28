/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head, sec = newHead;
        while(sec!=null){
            if(first.val != sec.val){
                reverse(newHead); 
                return false;
            }
            first = first.next;
            sec = sec.next;
        }
        reverse(newHead); 
        return true;
    }
    private static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode newTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newTemp;
        }
        return prev;
    }
}