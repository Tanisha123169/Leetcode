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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        call(a,root);
        return a;
    }
    void call(List<Integer> a,TreeNode root){
        if(root==null) return;
        call(a,root.left);
        a.add(root.val);
        call(a,root.right);
    }
}