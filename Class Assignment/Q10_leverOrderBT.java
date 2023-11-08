public class Q10_leverOrderBT {
    Node head;

    void leverOrderTraversal() {
        queue q = new queue(23);
        q.enqueue(head);

        while (!q.isEmpty()) {
            Node temp = q.dequeue();
            System.out.println(temp.data);

            if (temp.left != null) {
                q.enqueue(temp.left);
            }
            if (temp.right != null) {
                q.enqueue(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Q10_leverOrderBT bt = new Q10_leverOrderBT();

        bt.head = new Node(23);
        Node first = new Node(34);
        Node right = new Node(345);
        Node left = new Node(21);
        Node second = new Node(89);
        bt.head.left = left;
        bt.head.right = right;
        left.left = first;
        first.left = second;
        bt.leverOrderTraversal();

        /*
         * 23
         * / \
         * 21 345
         * /
         * 34
         * /
         * 89
         * the level order traversal funcion must sout like this 23 , 21, 345,34,89
         */
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class queue {
    Node[] qArray;
    int front, rear, size;

    queue(int capacity) {
        qArray = new Node[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isFull() {
        return size == qArray.length;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(Node node) {
        if (!isFull()) {
            qArray[++rear] = node;
            size++;
            if (rear == qArray.length - 1) {
                rear = -1;
            }
        } else {
            System.out.println("Q is full");
        }
    }

    Node dequeue() {
        if (!isEmpty()) {
            Node temp = qArray[front];
            front++;
            size--;
            if (front == qArray.length) {
                front = 0;
            }
            return temp;
        } else {
            System.out.println("queue is empty");
            return null;
        }
    }
}
