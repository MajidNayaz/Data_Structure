/**
 * Q7_middleLL
 */
public class Q7_middleLL {
    Node head;

    Q7_middleLL() {
        head = null;
    }

    void insertNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {

            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }

    }

    void display() {
        Node node = head;
        if (node == null) {
            System.out.println("Linked List is Null");
            return;
        }
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    void findMiddle() {
        Node node = head;

        if (node == null) {
            System.out.println("Linked List is Null");
            return;
        }
        Node slow = node;
        Node fast = node;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Q7_middleLL list = new Q7_middleLL();

        list.head = new Node(56);
        list.insertNode(78);
        list.insertNode(45);
        list.insertNode(46);
        list.insertNode(65);
        list.insertNode(34);
        list.insertNode(8);
        list.insertNode(5);
        list.display();
        list.findMiddle();

    }

}

class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        next = null;
    }
}