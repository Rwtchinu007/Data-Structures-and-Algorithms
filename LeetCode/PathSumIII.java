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

    // Counts valid paths STARTING exactly from this node
    public int countPaths(TreeNode root, long targetSum) {

        if (root == null)
            return 0;

        int count = 0;

        // Current node completes the required sum
        if (root.val == targetSum)
            count++;

        // Continue the current path downward
        count += countPaths(root.left, targetSum - root.val);
        count += countPaths(root.right, targetSum - root.val);

        return count;
    }

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null)
            return 0;

        
        int count = countPaths(root, targetSum);

        
        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }
}