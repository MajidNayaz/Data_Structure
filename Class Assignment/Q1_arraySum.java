/**
 * Q1_arraySum
 */
public class Q1_arraySum {
    static int addArry(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i]; 
        }
        return sum;
    }
 public static void main(String[] args) {
    int array [] = {1,2,3,4,5}; 

   System.out.println( addArry(array));
 }


}