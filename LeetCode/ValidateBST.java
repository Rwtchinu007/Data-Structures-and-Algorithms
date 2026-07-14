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
    boolean helper(TreeNode root, Integer max, Integer min) {
        if (root == null)
            return true;
        if ((max != null && max <= root.val) || (min != null && min >= root.val))
            return false;
        return helper(root.left, root.val, min) &&
                helper(root.right, max, root.val);
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);

    }
}