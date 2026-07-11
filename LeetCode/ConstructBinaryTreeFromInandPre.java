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
    int i=0;
    public TreeNode solve(int[] preorder, int[] inorder,int start,int end,Map<Integer,Integer> map){
        if(start>end) return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = solve(preorder,inorder,start,map.get(root.val)-1,map);
        root.right = solve(preorder,inorder,map.get(root.val)+1,end,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int j=0;j<inorder.length;j++){
        map.put(inorder[j],j);
    }
    TreeNode root = solve(preorder,inorder,0,inorder.length-1,map);
    return root;
        
    }
}