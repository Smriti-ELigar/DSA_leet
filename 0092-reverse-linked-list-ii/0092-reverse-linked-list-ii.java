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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode currN = head;
        ListNode leftpre = dummy;

        for(int i = 0; i<left-1; i++){
            leftpre = leftpre.next; //left pre is right before left
            currN = currN.next; //currn is at left now
        }

        ListNode subhead = currN; //subhead is at left

        ListNode preN = null;
        for(int i = 0; i<= right-left; i++){
            ListNode nextN = currN.next;
            currN.next = preN;
            preN= currN;
            currN = nextN;
        }

        //join the places
        leftpre.next = preN;
        subhead.next = currN; 

        return dummy.next;

    }
}