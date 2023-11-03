class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q8_reverSimpleLL {

    Node head;

    void insertNode(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(data);
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node node = head;
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }
        }
    }

    void reverse() {
        Node current = head;
        Node perv = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = perv;
            perv = current;
            current = next;

        }
        head = perv;
    }

    public static void main(String[] args) {
        Q8_reverSimpleLL list = new Q8_reverSimpleLL();

        list.insertNode(67);
        list.insertNode(6);
        list.insertNode(7);
        list.insertNode(567);
        list.insertNode(667);
        list.insertNode(678);
        list.insertNode(671);
        list.insertNode(627);
        list.insertNode(467);
        list.insertNode(617);
        list.reverse();
        list.display();

    }
}
