package day3;

public class BreakAndContinueDemo {

    static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;
            System.out.println("Break: " + i);
        }

        System.out.println("___________________________");

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println("Continue: " + i);
        }

        for (int i = 1; i <= 10; i--) {
            if (i == -5)
                break;
            System.out.println("Break: " + i);
        }
    }
}