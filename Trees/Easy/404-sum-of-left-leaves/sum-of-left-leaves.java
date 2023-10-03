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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum  = 0;
        if(root == null)
            return sum;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        boolean isLeft = false;
        while(!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            if(currentNode != null) {
                if(currentNode.left == null && currentNode.right == null && isLeft) {
                     sum += currentNode.val;
                     isLeft = false;
                 }
                 if(currentNode.right != null) {
                    stack.push(currentNode.right);
                    isLeft = false;
                }
                 if(currentNode.left != null) {
                    stack.push(currentNode.left);
                    isLeft = true;
                }
            }
        }
        return sum;
    }
}