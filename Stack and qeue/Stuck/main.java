import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Studen NewStudent = new Studen(10);
        while (true) {
            System.out.println("What do you want:");
            System.out.println("insert data = 1");
            System.out.println("delate data = 2");
            System.out.println("display all data = 3");
            System.out.println("return the last one = 4");
            System.out.println("is your stack full = 5");
            System.out.println("is your stack empty = 6");

            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();

            switch (user) {
                case 1:
                    System.out.println("Enter the value");
                    int userW = sc.nextInt();
                    NewStudent.push(userW);
                    break;

                case 2:
                    NewStudent.pop();
                    break;

                case 3:
                    NewStudent.display();
                    break;

                case 4:
                    NewStudent.peek();
                    break;

                case 5:
                    if (NewStudent.isFull()) {
                        System.out.println("Your stack is full");
                    } else {
                        System.out.println("your stack is not full");
                    }
                    break;

                case 6:
                    if (NewStudent.isEmpty()) {
                        System.out.println("your stack is empty");
                    } else {
                        System.out.println("your stack is not empty");
                    }
                    break;
                default:
                    System.out.println("you have an SQL syntax error ");
            }

        }

    }
}
