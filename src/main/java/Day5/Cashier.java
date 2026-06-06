package Day5;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the item: ");
        int quantity = sc.nextInt();
        double totalPrice =0;

        for (int i = 1; i <= quantity; i++) // i will loop till reach 5
        {
            System.out.println("Enter the price of the item: " + i);
            double itemPrice = sc.nextDouble();

            totalPrice+= itemPrice;;
        }
        System.out.println("Total price is: " + totalPrice);

    }
}
