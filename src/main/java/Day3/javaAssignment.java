package Day3;
import java.util.Scanner;
public class javaAssignment {

    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }


    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }


    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static int calculateSum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    System.out.println(checkNumberType(num));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int n2 = sc.nextInt();
                    System.out.println("The Sum of two number= " + calculateSum(n1, n2));
                    break;

                case 5:
                    System.out.println("Thank you for using The Route app.");
                    System.out.println("have a nice day");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}