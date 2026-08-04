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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int s=0;
        while(!q.isEmpty()){
           int a=0;
            int n=q.size();
            for(int i=1;i<=n;i++){
          TreeNode curr=q.poll();
          if(curr.left!=null) q.offer(curr.left);
          if(curr.right!=null) q.offer(curr.right);
          a+=curr.val;
            }
            s=a;
        }
        return s;
    }
}