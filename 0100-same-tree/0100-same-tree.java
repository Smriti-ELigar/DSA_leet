/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        // If only one of the nodes is
        // NULL, they are not identical
        if (p == null || q == null) {
            return false;
        }
        // Check if the current nodes
        // have the same val value
        // and recursively check their
        // left and right subtrees
        return ((p.val == q.val)&& isSameTree(p.left, q.left)&& isSameTree(p.right, q.right));
    }
        
    
}