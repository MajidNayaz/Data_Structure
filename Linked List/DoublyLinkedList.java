public class DoublyLinkedList {
    class Node {
    int data;
    Node next, prevous;

    Node(int data) {
        this.data = data;
        next = prevous = null;
    }
}
    Node head;
    Node tail;
    int lenght;

    DoublyLinkedList() {
        head = tail = null;
        lenght = 0;
    }

    boolean isEmpty() {
        return lenght == 0;
    }

    int lenght() {
        return lenght;
    }

    void displeyForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + ", ");
            temp = temp.next;
        }
    }

    void displeyBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data + ", ");
            temp = temp.prevous;
        }
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        newNode.prevous = tail;
        tail = newNode;
        lenght++;

    }

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.insertLast(23);
        ll.insertLast(34);
        ll.insertLast(45);
        ll.insertLast(120);
        ll.displeyBackward();
        ll.displeyForward();
    }

}


