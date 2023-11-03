class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class simpleLinkedList {

    Node head;

    simpleLinkedList() {
        head = null;
    }
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
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        simpleLinkedList list = new simpleLinkedList();
        list.head = new Node(346);
        list.insertNode(34);
        list.insertNode(78);
        list.insertNode(678);
        list.insertNode(765);
        list.insertNode(4567);
        list.display();
    }
}