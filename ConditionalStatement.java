package day2;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        //Scanner -> allow take input from external source

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age , please!  ");

//        int personAge = sc.nextInt();
//
//        String status = personAge >= 18 ? "good to vote " : "not good to vote";
//
//         System.out.println("Your status is: " + status);
//
//
//        System.out.println(" Your status is : " + status);

//        if (personAge >= 18) {
//
//            System.out.println("good to vote");
//        } else {
//            System.out.println("not good to vote");
//        }

        // Program to check if the number is even or odd

        System.out.println("Enter a number to decide even or odd");

        int number = sc.nextInt();
        //True
        if (number >= 0) {

            if (number == 0) {
                System.out.println("The number is zero");
            } else if (number % 2 == 0) {
                System.out.println("The number " + number + " is even");
            } else {
                System.out.println("The number " + number + " is odd");
            }
        } else
            System.out.println("Negative number is not allowed ");
    }
}
