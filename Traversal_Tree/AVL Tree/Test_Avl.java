import java.util.Scanner;
class Node {
    int data, height;
    Node left, right;
    Node (int data){
        this.data = data;
        height = 1;
    }
}

public class Test_Avl {

    Node root;
    int height(Node node){
        return node==null ? 0 : node.height;
    }

    int getBalance(Node node) {
        return node==null ? 0 : node.left.height - node.right.height;
    }

    public Node leftRotate(Node node) {

        Node rightNode = node.right;
        Node temp = rightNode.left;

        rightNode.left = node;
        node.right = temp;

        return rightNode;
    }

    public Node rightRotate(Node node) {

        Node leftNode = node.left;
        Node temp = leftNode.right;

        leftNode.right = node;
        node.left = temp;

        return leftNode;
    }

    public Node insertNode(Node node, int data) {

        if(node == null) {
            return (new Node(data));
        }

        if(data>node.data) {
            node.right = insertNode(node.right, data);
        }if else (data<node.data) {
            node.left = insertNode(node.left, data);
        }else 
        return node;

        int balance = getBalance(node);

        if(balance > 1) {
            if(node.left.data>data){
                node.left = rightRotate(node.left);
            }
            return rightRotate(node);
        }

        if(balance < -1) {
            if(node.right.data<data){
                node.right = rightRotate(node.right);
            }
            return rightRotate(node);
        }
    }
}
