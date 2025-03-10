/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> oldtocopy = new HashMap<>();
        oldtocopy.put(null,null);

        Node cur = head;
        while(cur!=null){
            Node copy = new Node(cur.val);
            oldtocopy.put(cur,copy);
            cur = cur.next;
        }

        cur = head;
        while(cur!=null){
            Node copy = oldtocopy.get(cur);
            copy.next = oldtocopy.get(cur.next);
            copy.random = oldtocopy.get(cur.random);
            cur = cur.next;
        }
            return oldtocopy.get(head);

        
    }
}