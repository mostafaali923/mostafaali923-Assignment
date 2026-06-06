package Day5;

public class BreakAndContinueDemo {

    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++)
        {
            if (i == 5) {
                break; // it will stop the loop when i is 5
            }
            System.out.println("Break: " + i);

        }

        System.out.println("-----------------------------------");

        for (int i = 1 ; i <= 10 ; i++)
        {
            if (i == 5) {
                continue; // it will skip the rest of the loop when i is 5
            }
            System.out.println("Continue: " + i);

        }

        System.out.println("-----------------------------------");

        for (int i = 1 ; i <= 10 ; i--)
        {
            if (i == -5) {
                break; // it will stop the loop when i is 5
            }
            System.out.println("Break: " + i);

        }
    }
}
