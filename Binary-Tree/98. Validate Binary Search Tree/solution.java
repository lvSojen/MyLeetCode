// Runtime
// 3 ms
// Beats
// 16.90%
    // Memory
    // 43.8 MB
    // Beats
    // 41.75%
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        int currentValue = Integer.MIN_VALUE;
        stack.add(currentNode);
        int lowBound = Integer.MAX_VALUE;
        while(!stack.isEmpty()) {
            currentNode = stack.pop();
            currentValue = currentNode.val;
            if(currentNode.left != null) {
                if(currentValue <= currentNode.left.val && currentValue >=lowBound) return false;
                stack.add(currentNode.left);
            } else {
                if(currentValue < lowBound) {
                    lowBound=currentValue;
                }
            }
            if(currentNode.right != null) {
                if(currentValue >= currentNode.right.val) return false;
                stack.add(currentNode.right);
            }
        }
        return true;
    }
}