import java.util.Scanner;
class Node {
    int data, height;
    Node left, right;
    Node (int data){
        this.data = data;
        height = 1;
    }
}
/**
 * Test_Avl
 */
public class Test_Avl {

    Node root;
    int height(Node node){
        if(node == null) {
            return 0;
        }
    return node.height;
    }

    int getBalance(Node node) {
        if(node == null) {
            return 0;
        }
        return node.left.height - node.right.height;
    }
}
