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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> a = new ArrayList<>();
        if(root==null) return a;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean f = true;
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
               if(f){
                b.add(curr.val);
               }else{
                b.add(0,curr.val);
               }
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            a.add(b);
            f=!f;
        }
        return a;
    }
}