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
 //recurssion then iterative

        // if(list1 == null){
        //     return list2;
        // }
        // if(list2 == null){
        //     return list1;
        // }
        // if(list1.val <= list2.val){
        //     list1.next = mergeTwoLists(list1.next,list2);
        //     return list1;
        // }
        // else{
        //     list2.next = mergeTwoLists(list1,list2.next);
        //     return list2;

        // }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy; //ptr for dummy linkedlist pointing at 0th position

        while(list1!= null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next; //to iterate over list1
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next; //after inserting a node iterating over dummy ll

        }
        if(list1 != null){ //the base case if either of the ll is null the other is inserted
            tail.next = list1;
        }
        if(list2 != null){
            tail.next = list2;
        }

        return dummy.next; //the entire merged list
        
    }
}

// Visualization
// list1	    list2	    Merged List (Result)
// 1 → 3 → 5	2 → 4 → 6	1
// 3 → 5	    2 → 4 → 6	1 → 2
// 3 → 5	    4 → 6	    1 → 2 → 3
// 5	        4 → 6	    1 → 2 → 3 → 4
// 5	        6	        1 → 2 → 3 → 4 → 5
// null	        6	        1 → 2 → 3 → 4 → 5 → 6