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
      long max = 0;
    public int maxProduct(TreeNode root) {
        long sum = findSum(root);
        maxSum(root, sum);
        return (int)(max % (int)(1e9 + 7));
    }
   
    public long findSum(TreeNode root){
        if(root == null) return 0;
        
       return findSum(root.left)+findSum(root.right)+root.val;
    }
      public long maxSum(TreeNode root, long sum){
        if(root == null) return 0;
        
        long left = maxSum(root.left, sum);
        long right = maxSum(root.right, sum);
        
        long curr = left + right + root.val;
        max = Math.max(max, curr * (sum - curr));
        return curr;
    }
     
}