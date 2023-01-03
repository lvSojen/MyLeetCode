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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        Integer value = null;
        while(temp != null || !stack.isEmpty()) {
            while(temp != null) {
                stack.add(temp);
                temp = temp.left;
            }
            TreeNode currentNode = stack.pop();
            if(value != null && currentNode.val <= value) return false;
            value = currentNode.val;
            temp = currentNode.right;
        }
        return true;
    }
}