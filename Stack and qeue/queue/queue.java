public class queue {
    public static void main(String[] args) {
        queueOpration q = new queueOpration(4);
        q.enqueue(34);
        q.enqueue(46);
        q.enqueue(89);
        q.enqueue(45);
        q.enqueue(56);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(234);
    }
}

class queueOpration {
    private int front, rear, size;
    private int queueArray[];

    queueOpration(int capacity) {
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isfull() {
        return size == queueArray.length;
    }

    int size() {
        return size;
    }

    void enqueue(int data) {
        if (!isfull()) {
            queueArray[++rear] = data;
            size++;
            if(rear == queueArray.length-1) {
                rear = 0;
            }
            System.out.println("element inserted");
        } else {
            System.out.println("Queue is full");
        }
    }

    void dequeue() {
        if (!isEmpty()) {
            front++;
            size--;
            System.out.println("element dequeded");
            if (front == queueArray.length) {
                front = 0;
            }
        } else {
            System.out.println("Queue is empty");
        }
    }
}