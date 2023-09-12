package Traversal_Tree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTry {

    Node root;

    BinaryTry() {
        root = null;
    }

    void posstorder(Node node) {
        if (node == null)
            return;
        // left right root
        posstorder(node.left);
        posstorder(node.right);
        System.out.println(node.data);

    }

    void inOrder(Node node) {
        if (node == null)
            return;

        // left root right
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    void preOrder(Node node) {
        if (node == null)
            return;
        // root left right
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);

    }
}

public class Traversal1 {

    public static void main(String[] args) {
        BinaryTry tree = new BinaryTry();
        tree.root = new Node(2);
        tree.root.left = new Node(34);
        tree.root.left.left = new Node(45);
        tree.root.left.right = new Node(43);
        tree.root.right = new Node(13);
        tree.root.right.left = new Node(1);
        tree.root.right.right = new Node(56);
        System.out.println("inOreder Traverserl :");
        tree.inOrder(tree.root);
        System.out.println("preOrder traaversal ");
        tree.preOrder(tree.root);
        System.out.println("postoreder traversal");
        tree.posstorder(tree.root);

    }
}
