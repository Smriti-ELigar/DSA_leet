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
    //using recurssion
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(subRoot == null){
            return true;
        }
        if (SameTree(root,subRoot)){
            return true;
        }
        else{
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
        
    }
    public boolean SameTree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot==null){
            return true;
        }
        if(root!=null && subRoot!=null && root.val== subRoot.val){
            //go to left and right of roots only if both roots values are same
            return SameTree(root.left, subRoot.left) && SameTree(root.right, subRoot.right);
        }
        return false;
        //if none of the root values are same
    }

}
// First, it checks if root and subRoot are identical using sameTree.
// If they aren’t identical, it checks whether subRoot is a subtree of either the left or right part of root.