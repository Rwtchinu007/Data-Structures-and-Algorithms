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
    public static boolean sameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p == null && q != null) || (p != null && q == null))
            return false;
        if (p.val == q.val) {
            Boolean left = sameTree(p.left, q.right);
            Boolean right = sameTree(p.right, q.left);
            return left && right;
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return sameTree(root.left, root.right);

    }

}
