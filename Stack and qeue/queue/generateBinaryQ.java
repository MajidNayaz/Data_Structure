import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * this program will generate the equalent binary number from zero to a n integer number
 * generateBinaryQ
 */
public class generateBinaryQ {
    public static String[] GBN(int n) {
        String A [] = new String[n];
        Queue<String> Q = new LinkedList<>();
        Q.offer("1");
        for (int i = 0; i < n; i++) {
            A[i] = Q.poll();
            String n1 = A[i] + "0";
            String n2 = A[i] + "1";
            Q.offer(n1);
            Q.offer(n2);
        }
        return A;
    }
public static void main(String[] args) {
    System.out.println("Whitch numbe do you want to see it is equalent Binary number"); 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String result [] = GBN(n);
    for (String s : result) {
     System.out.println(s);        
    }
}
}