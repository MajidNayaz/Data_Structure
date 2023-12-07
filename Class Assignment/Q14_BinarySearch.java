/**
 * Q14_BinarySearch
 */
public class Q14_BinarySearch {

    public static int binarySearch(int[] arr, int searchValue) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int med = (high + low) / 2;
            if (searchValue == arr[med]) {
                System.out.println(searchValue + " found at index " + med);
                return med;
            }
            if (searchValue > arr[med]) {
                low = med + 1;
            } else {
                high = med - 1;
            }
        }
        System.out.println(searchValue + " Not found ");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, 15, 24, 34, 43, 45, 67, 89 };
        binarySearch(arr, 12);
        binarySearch(arr, 15);
        binarySearch(arr, 18);
        binarySearch(arr, 89);
    }
}