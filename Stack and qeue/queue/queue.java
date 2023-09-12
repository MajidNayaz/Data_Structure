public class queue {
    int size;
    int QuArray[] = new int[size];
    int front, rear;

    queue() {
        front = rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        return front == -1;
    }

    void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                rear = 0;
            QuArray[front++] = data;
            System.out.println("Inserted " + data);
        }
    }
    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
          System.out.println("Empty Queue");
        } else {
          System.out.println("\nFront index-> " + front);
          System.out.println("Items -> ");
          for (i = front; i <= rear; i++)
            System.out.print(QuArray[i] + "  ");
    
          System.out.println("\nRear index-> " + rear);
        }
      }   
}

