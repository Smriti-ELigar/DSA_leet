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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        dia[0]=0;

        height(root,dia);
        return dia[0];
        
    }
    private int height(TreeNode node, int[] dia){
        if(node == null)return 0;
        int[] lh = new int[1];
        int[] rh = new int[1];
        lh[0] = height(node.left,dia);
        rh[0] = height(node.right,dia);

        dia[0] = Math.max(dia[0],lh[0]+rh[0]);
        return 1 + Math.max(lh[0],rh[0]);
    }
}