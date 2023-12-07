import java.util.Scanner;

/**
 * Q13_Fibonacci
 */
public class Q13_Fibonacci {

    public static int fibonacci(int n) {
        int arr[];
        if (n >= 2) {
            arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

        } else {
            arr = new int[2];
            arr[0] = 0;
            arr[1] = 1;
        }

        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleas inter the nth fibonacci number");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}