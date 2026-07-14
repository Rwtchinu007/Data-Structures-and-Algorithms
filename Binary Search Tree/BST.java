
public class BST {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode root;

    public TreeNode insertNode(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = bst.insertNode(bst.root, 50);
        bst.root = bst.insertNode(bst.root, 30);
        bst.root = bst.insertNode(bst.root, 20);
        bst.root = bst.insertNode(bst.root, 40);
        bst.root = bst.insertNode(bst.root, 70);
        bst.root = bst.insertNode(bst.root, 60);
        bst.root = bst.insertNode(bst.root, 80);
        bst.root = bst.insertNode(bst.root, 90);
        bst.inorder(bst.root);
    }
}
