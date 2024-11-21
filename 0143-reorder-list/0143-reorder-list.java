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
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = head.next;
            fast = head.next.next;
        }

        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while(second!=null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;  //reversed ll stored in prev of  2nd half
            second = temp;
        }
        // 1->2->4->3
        //prev : 4->3
        

        ListNode first = head;
        second = prev;
        while(second!=null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}