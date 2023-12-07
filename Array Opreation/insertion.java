public class insertion {

    public static int[] insert(int data, int[] oldarr) {
        int newArr[] = new int[oldarr.length + 1];

        for (int i = 0; i < oldarr.length; i++) {
            newArr[i] = oldarr[i];
        }
        newArr[oldarr.length] = data;
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 45, 6, 7, 8, 8, 912 };
        insert(876, arr);
        insert(1000, arr);

    }

}