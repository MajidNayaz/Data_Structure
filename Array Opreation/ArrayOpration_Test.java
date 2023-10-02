import java.net.SocketTimeoutException;
import java.util.Scanner;

public class ArrayOpration_Test {
    public static int[] insertionE(int oldArray[], int data) {      //insertion function

        int newArray[] = new int[oldArray.length + 1];

        System.out.println("Where do you wanna insert your Element \n Enter: \n 1 for at the biggening ");
        System.out.println(" 2 for at the end \n 3 for spacific Endix ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {                                           //switch for where should insert
            case 1:
                newArray[0] = data;
                for (int i = 0; i < oldArray.length; i++) {
                    newArray[i + 1] = oldArray[i];
                }
                System.out.println(data+" Inserted successfully at endix "+0);
                break;
            case 2:
                for (int i = 0; i < oldArray.length; i++) {
                    newArray[i] = oldArray[i];
                }
                newArray[newArray.length - 1] = data;
                System.out.println(data+" Inserted successfully at endix "+(newArray.length-1));
                break;
            case 3:
                int index=0;
                System.out.println("Enter the Endix you wanna insert:");
                int wh = sc.nextInt();
                for (int i = 0; i < oldArray.length; i++) {
                    if (i < wh) {
                        newArray[i] = oldArray[i];
                    } else if (i == wh) {
                        index = i;
                        newArray[i] = data;
                    } else if (i < wh) {
                        newArray[i + 1] = oldArray[i];
                    }
                }
                System.out.println(data+" Inserted successfully at endix "+index);
                break;
            default:
                System.out.println("Oops you number is wrong");
                break;
        }

        return newArray;
    }                                                           //end of insertion function

    public static void traversal(int Array[]){
        System.out.println("if you are agree please inter one !");
    }
                                                                
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter "+size+" element sprated by one space");

        int array[] = new int [size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        while (true){
        System.out.println("Please enter: \n 1 for inserton \n 2 for traversal \n 3 for delation");
        System.out.println(" 4 for sorting \n 5 for searching ");

        
        int option = sc.nextInt();
                switch (option) {
            case 1: // for insertion
             System.out.println("Enter you data: ");
             
             int data = sc.nextInt();
             insertionE(array, data);
            break;
            case 2: // for traversal
            
            break;
            case 3: // for delation
            
            break;
            case 4:  // for sorting
            
            break;
            case 5:  // for searching 
            
            break;
            default:
            System.out.println("your number is not valid! \n please enter a valid number");
            break;
        }
    }
    }

}