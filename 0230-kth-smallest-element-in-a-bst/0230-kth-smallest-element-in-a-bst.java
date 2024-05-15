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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        find(root,qu);
        int i=1;
        while(i < k){
            qu.poll();
            i++;
        }
        return qu.poll();
            
    }
    void find(TreeNode root,PriorityQueue<Integer> qu){
        if(root==null) return;
        qu.add(root.val);
        find(root.left,qu);
        find(root.right,qu);
        return;
    }
}