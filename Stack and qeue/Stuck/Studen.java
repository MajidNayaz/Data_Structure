public class Studen {

    private int maxsize = 0;
    private int stackArray[];
    private int top = -1;

    public Studen(int maxsize) {

        this.maxsize = maxsize;
        stackArray = new int[maxsize];
    }

    public void push(int data) {
        if (isFull())
            System.out.println("your stack is full");
        else {
            stackArray[top + 1] = data;
            top++;
        }

    }

    public void pop() {
        top--;
    }

    public Object peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public void display() {
        // int temp = top;
        while (!isEmpty()) {
            System.out.println(stackArray[top]);
            top--;
        }

    }

}