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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return a;
        q.offer(root);
        while(!q.isEmpty()){
           int n=q.size();
             List<Integer> b=new ArrayList<>();
             for(int i=0;i<n;i++){
                 TreeNode curr=q.poll();
            b.add(curr.val);
            if(curr.left!=null) q.offer(curr.left);

    if(curr.right!=null) q.offer(curr.right);
             }
        a.add(b);
        }
        return a;
    }
}