/*
 * int this sanareo we will implement stack opration like 
 * pop(), push(), isEmpty(), isFull(), top() and size()
 */
///////////////////////////////////////////// size is not passed throw the array size inside the stack_p
import java.util.Scanner;

public class Stack_p {
    int top;
    int size;
    
    Stack_p(int size) {
        this.size = size;
        top = -1;
    }
    int s = size;
    int arr[] = new int[size];
    // at first is empty function

    boolean isEmpty(int top) {
        return (top < 0);
    }
    // Is Full function

    boolean isFull(int top) {
        return (top == size - 1);
    }

    // Push function

    boolean push(int x) 
    { 
        if (top >= (size-1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            top++;
            arr[top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
    // pop function

    boolean pop() {
        if (isEmpty(top)) {
            System.out.println("stack is Empty");
            return false;
        } else {
            top -= top;
            System.out.println(arr[top]+" puped successfully");
            return true;
        }
    }
    // top function

    void top() {
        System.out.println("top is " + arr[top]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your stack");
        int size = sc.nextInt();
        Stack_p q = new Stack_p(size);
        System.out.println("the s amuont = " +q.s);
        System.out.println("the amount of size = "+size);
        System.out.println("th amount of Q.size = "+q.size);
        while (true) {

            System.out.println(" for push->1 \n for top->2 \n for pop->3");
            System.out.println(" for isempty-> 4 \n for isfull->5 ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter the elemtn you wanna push: ");
                    int x = sc.nextInt();
                    q.push(x);
                    break;

                case 3:
                    q.pop();
                    break;

                case 4:
                    if (q.isEmpty(q.top))
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Stack is not empty");
                    break;
                case 5:
                    if (q.isFull(q.top))
                        System.out.println("Stack is Full");
                    else
                        System.out.println("Stack is not Not Full");
                    break;

            }
        }
    }
}
