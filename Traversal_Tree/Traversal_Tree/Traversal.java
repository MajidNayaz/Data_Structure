package Traversal_Tree;

//every node has one root data, left and right pointers to it's children
class Node {
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = right = null;
    }
}

class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree() {
        root = null;
    }

    void posstorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        posstorder(node.left);
        // traverse right
        posstorder(node.right);
        // Traverse root
        System.out.println(node.item + "->");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        // Traverse left
        inorder(node.left);
        // Traverse root
        System.out.println(node.item + "->");
        // Traverse right
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.println(node.item + "->");

        // traverse left
        preorder(node.left);
        // traverse right
        preorder(node.right);

    }
}

public class Traversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\n Preorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.posstorder(tree.root);

        System.out.println(System.currentTimeMillis());
    }

}
// 1
// 12 9
// 5 6|