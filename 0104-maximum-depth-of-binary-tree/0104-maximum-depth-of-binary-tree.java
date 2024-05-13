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
     int count = 0;
    public int maxDepth(TreeNode root) {
       find(root,0);
        return count;
    }
     void find(TreeNode root,int level){
        if(root == null) return;
         if(count == level) count++;
         find(root.left,level+1);
         find(root.right,level+1);
    }
}