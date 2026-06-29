
import java.util.Scanner;

class Node {
// this node class is used to create a node of the binary tree
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {

    Scanner sc = new Scanner(System.in);

    Node createBinaryTree() {
        // it is a method to create a binary tree and returns the root node of the tree

        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }
// creates a new node
        Node root = new Node(data);

// recursively creates the left and right subtrees
        System.out.println("Enter left child of " + data);
        root.left = createBinaryTree();

        System.out.println("Enter right child of " + data);
        root.right = createBinaryTree();

        return root;
    }

    void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

public class CreationBT {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        System.out.println("Enter root node (-1 for NULL):");
        Node root = bt.createBinaryTree();

        System.out.println("Binary Tree created successfully.");
        System.out.print("Preorder traversal: ");
        bt.preorder(root);
    }
}
