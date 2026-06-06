package Day5;

import java.util.Scanner;

public class AddNumberDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean flag ; //false


        do {
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to sum other number \n" +
                    "Write true if you want to insert another number \n" +
                    "if not write false");
            flag = sc.nextBoolean();

            if (flag == false) {

                System.out.println("Thank you for using this program ");
            }
        }

        while (flag); // = True

    }
}
