public class Q2_arrayReverse {
    public static void reverseArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7 };
        reverseArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }
}