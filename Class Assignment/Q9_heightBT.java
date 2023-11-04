/**
 * Q9_heightBT
 */
public class Q9_heightBT {
    Node head;

    
    int getHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);

            // Return the maximum height between the left and right subtrees, plus 1 for the current node
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public static void main(String[] args) {
        Q9_heightBT bt = new Q9_heightBT();

        bt.head = new Node(23);
        Node first = new Node(34);
        Node right = new Node(345);
        Node left = new Node(21);
        Node second = new Node(89);
        bt.head.left = left;
        bt.head.right = right;
        left.left = first;
        first.left = second;
        
        /*
                 head
               /      \
            left     right
           /     
        first
        /
      second 

      the height(head ) must return 3 as the height of our tree
         */

         System.out.println("height of your tree = "+ bt.getHeight(bt.head));
    }
}    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }