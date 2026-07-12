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
    int i = 0;

    public TreeNode solve(int[] preorder, int[] postorder,
                          int start, int end,
                          Map<Integer, Integer> map) {

        if (start > end)
            return null;

        TreeNode root = new TreeNode(preorder[i++]);

        // Only one node in this subtree
        if (start == end)
            return root;

        
        int leftRootIndex = map.get(preorder[i]);

        root.left = solve(preorder, postorder,
                          start, leftRootIndex, map);

        root.right = solve(preorder, postorder,
                           leftRootIndex + 1, end - 1, map);

        return root;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < postorder.length; j++) {
            map.put(postorder[j], j);
        }

        return solve(preorder, postorder,
                     0, postorder.length - 1, map);
    }
}