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
    int diff;
    public int maxAncestorDiff(TreeNode root) {
       helper(root,root.val,root.val);
        return diff;
    }
    void helper(TreeNode root,int max , int min){
        if( root==null) return;
        
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
         diff=Math.max(diff,(max-min));
        helper(root.left,max,min);
        helper(root.right,max,min);
        
    }
}