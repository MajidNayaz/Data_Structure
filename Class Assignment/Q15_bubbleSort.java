/**
 * Q15_bubbleSort
 */
public class Q15_bubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 1, 34, 45, 67, 89, 10, 29, 38, 5, 8, 1 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}