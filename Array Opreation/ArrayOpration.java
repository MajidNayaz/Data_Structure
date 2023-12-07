import java.util.Scanner;

public class ArrayOpration {
    /*
     * Array Traversal
     * Array Searching
     * Array Insrting
     * Array delation
     * Array Sorting
     * 
     */

    public static void main(String[] args) {
        System.out.println("Hello Welcom!");
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);

        int size, numbers[], option;
        size = sc.nextInt();
        numbers = new int[size];
        opration op = new opration();

        System.out.println("Enter " + size + " Element of the array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        while (true) {
            System.out.println(
                    "Enter: \n 1 for travresal \n 2 for Searching \n 3 for Insertion \n 4 for Delation \n 5 for Sorting ");
            option = sc.nextInt();
            switch (option) {
                case 1: // Traversal
                    op.traversal(size, numbers);
                    break;
                case 2: // Seraching
                    op.searching(size, numbers);
                    break;
                case 3: // Insertion
                    op.insert(size, numbers);
                    break;
                case 4: // Delation

                    break;
                case 5: // Sorting


                    break;
                default:
                    break;
            }

        }
    }
}

class opration {
    void traversal(int size, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", ");
        }
    }

    void searching(int size, int arr[]) {
        System.out.println("Enter the element you wanna search :");
        Scanner sc = new Scanner(System.in);

        int element = sc.nextInt();
        int endex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                endex = i;
                break;
            }
        }
        if (endex > -1) {
            System.out.println("Your element found at endex " + endex);
        } else {
            System.out.println("Element not found!");
        }
    }

    void insert(int size, int arr[]) {
        int element, innerOption, newarr[],endex;
        newarr = new int [arr.length];        
        Scanner sc = new Scanner(System.in);
        System.out.println("where you wanna insert the element? ");
        System.out.println("Enter: \n 1 Bigining \n 2 End \n 3 at spefic endex"); 
        innerOption = sc.nextInt();
        System.out.println("Enter the element you wanna insert:");
        element= sc.nextInt();
       
        if (innerOption == 1) {
            newarr[0] = element;
            for (int i = 1; i < arr.length; i++) {
                newarr[i] = arr[i - 1];

            }
            System.out.println("Your element inserted successfully");
        }else if(innerOption == 2){
            newarr[arr.length-1] = element;
            for (int i = 0; i < arr.length; i++) {
                newarr[i] = arr[i];
            }
            System.out.println("Your element inserted successfully!");
        }else if(innerOption == 3){
            System.out.println("Enter the endex you wanna insert:");
            endex = sc.nextInt();
            for (int i = 0; i <= arr.length; i++) {
                if(i<endex){
                    newarr[i] = arr[i];
                }else if (endex == i){
                    newarr[i] = element;
                }else if (i>endex){
                    newarr[i] = arr[i+1];
                }else{
                    System.out.println("you have entered wrong number!");
                }
            }
            System.out.println("Your element inserted successfully!");
        }else{
            System.out.println("you have entered wrong number!");
        }
    }
}