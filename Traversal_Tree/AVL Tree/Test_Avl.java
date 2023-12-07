class Node {
    int data, height;
    Node left, right;

    Node(int data) {
        this.data = data;
        height = 1;
    }
}

public class Test_Avl {

    Node root;

    int height(Node node) {
        return node == null ? 0 : node.height;
    }

    int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    Node leftRotate(Node node) {
        Node rightNode = node.right;
        Node temp = rightNode.left;

        rightNode.left = node;
        node.right = temp;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        rightNode.height = Math.max(height(rightNode.left), height(rightNode.right)) + 1;

        return rightNode;
    }

    Node rightRotate(Node node) {
        Node leftNode = node.left;
        Node temp = leftNode.right;

        leftNode.right = node;
        node.left = temp;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        leftNode.height = Math.max(height(leftNode.left), height(leftNode.right)) + 1;

        return leftNode;
    }

    public Node insertNode(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data > data) {
            node.left = insertNode(node.left, data);
        } else if (node.data < data) {
            node.right = insertNode(node.right, data);
        } else {
            return node;
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int balance = getBalance(node);

        if (balance > 1) {
            if (node.left.data < data) {
                node.left = leftRotate(node.left);
            }
            return rightRotate(node);
        }

        if (balance < -1) {
            if (node.right.data > data) {
                node.right = rightRotate(node.right);
            }
            return leftRotate(node);
        }

        return node;
    }

    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + ", ");
        inOrder(node.right);
    }

    public static void main(String[] args) {

        Test_Avl av = new Test_Avl();
        av.root = av.insertNode(av.root, 67);
        av.root = av.insertNode(av.root, 34);
        av.root = av.insertNode(av.root, 68);
        av.root = av.insertNode(av.root, 70);
        av.root = av.insertNode(av.root, 100);
        av.root = av.insertNode(av.root, 20);
        av.root = av.insertNode(av.root, 15);
        av.root = av.insertNode(av.root, 10);
        av.insertNode(av.root, 39);
        System.out.println("preOrder root left right: ");
        av.preOrder(av.root);
        System.out.println();
        System.out.println("inOrder left root right");
        av.inOrder(av.root);
        System.out.println();
    }
}
