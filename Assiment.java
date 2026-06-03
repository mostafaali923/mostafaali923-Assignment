package day3;

public class Assiment {
    public static void main(String[] args) {

        //Print numbers from 1 to 10
        System.out.println("--------------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Repeat a message 10 times
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello message");
        }

        //Print even numbers from 1 to 10
        System.out.println("--------------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //Check if numbers from 1 to 10 are even or odd
        System.out.println("--------------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }


        //Countdown from 10 to 1
        System.out.println("--------------------------------------------------------");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}