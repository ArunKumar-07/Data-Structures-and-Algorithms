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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
     
        findLeaf(root1,list1);
         findLeaf(root2,list2);
        return list1.equals(list2);
        
    }
 void findLeaf(TreeNode root,ArrayList<Integer> list){
     if(root==null) {
         return;
     }
     if(root.left== null && root.right==null){
         list.add(root.val);
     }
   
     findLeaf(root.left,list);
     findLeaf(root.right,list);
    }
   
}