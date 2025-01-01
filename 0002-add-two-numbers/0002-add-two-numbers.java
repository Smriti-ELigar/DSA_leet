/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListListNode(int val) { this.val = val; }
 *     ListListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(-1);
        ListNode curr = dummyhead; // 'curr' is a pointer that we'll use to build the list.
        ListNode temp1 = l1;// Temp pointers to traverse the two input lists.
        ListNode temp2 = l2;
        int carry = 0;// Carry to keep track of values > 9 during addition.

        while(temp1 != null || temp1 != null){
            int sum = carry;
            if(temp1!=null){
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if(temp2!=null){
                sum += temp2.val;
                temp2 = temp2.next;
            }
            ListNode newn = new ListNode(sum%10);
            carry  =sum/10;
            curr.next = newn;
            curr = curr.next; 
        }
        if(carry>0){
            curr.next = new ListNode(carry);// If there's still a carry left, create a final node.
        }
        return dummyhead.next; //real head
    }
}