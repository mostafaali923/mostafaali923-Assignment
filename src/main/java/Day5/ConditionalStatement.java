package Day5;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter 1st number, plz");
//        int firstNum = sc.nextInt();
//
//        System.out.println("Enter 2nd number, plz");
//        int secondNum = sc.nextInt();
//
//        System.out.println("Enter 3rd number, plz");
//        int thirdNum = sc.nextInt();
//
//        if (firstNum == secondNum && firstNum == thirdNum) {
//            System.out.println("All numbers are equal");           // Assignment
//
//        } else {
//
//            if (firstNum > secondNum && firstNum > thirdNum) {
//                System.out.println("First number " + firstNum + " is the greatest");
//
//            } else if (secondNum > firstNum && secondNum > thirdNum) {
//                System.out.println("Second number " + secondNum + " is the greatest");
//
//            } else {
//                System.out.println("Third number " + thirdNum + " is the greatest");
//            }
//        }
//

        System.out.println("Enter the day number: ");

//        int dayNum = sc.nextInt();

        String dayNum = sc.nextLine();

//        if (dayNum == 1) {
//            System.out.println("Monday");
//        } else if (dayNum == 2) {
//            System.out.println("Tuesday");
//        } else if (dayNum == 3) {
//            System.out.println("Wednesday");
//        } else if (dayNum == 4) {
//            System.out.println("Thursday");
//        } else if (dayNum == 5) {
//            System.out.println("Friday");
//        } else if (dayNum == 6) {
//            System.out.println("Saturday");
//        } else if (dayNum == 7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Invalid input. Please enter a number from 1 to 7");
//        }

        switch (dayNum) {
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Thursday":
                System.out.println(4);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;

            default:
                System.out.println("Invalid input. Please enter a valid day name");
        }


    }}
