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
    public int maxDepth(TreeNode root) {
        int countofLevels = 0;
        if(root == null)
            return countofLevels;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if(temp != null) {
                if(temp.left != null)
                    queue.offer(temp.left);
                if(temp.right!= null)
                    queue.offer(temp.right);
            }
            else {
                countofLevels++;
                if(!queue.isEmpty())
                    queue.offer(null);
            }
        }
        return countofLevels;
    }
}