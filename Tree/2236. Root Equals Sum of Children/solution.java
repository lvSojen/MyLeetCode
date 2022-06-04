// Link
// https://leetcode.com/submissions/detail/714474965/
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
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val+root.right.val);
    }
}

// Alternative
class Solution {
    public boolean checkTree(TreeNode root) {
        int left = root.left.val;
        int right = root.right.val;
        
        return root.val == (left+right);
    }
}