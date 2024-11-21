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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode front = curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        
        }
        return prev;   
    }
}
// 1->2->3
// u want 2 to point 1 instead of 3, 3 to 2 and 1 to 3
