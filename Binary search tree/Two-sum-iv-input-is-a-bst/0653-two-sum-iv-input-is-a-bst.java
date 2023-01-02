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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
          return twoSum(root,k,set);
    }
    private boolean twoSum(TreeNode root,int k ,HashSet<Integer> set ){
        if(root==null) return false;
        
         if(set.contains(k-root.val)) return true;
        set.add(root.val);
       
        return twoSum(root.left,k,set) || twoSum(root.right,k,set);
    }
}