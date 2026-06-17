package Day7;

import java.util.Scanner;

public class LinearSearch {

    Scanner input = new Scanner(System.in);

    String[] fruits = {"apple", "orange", "banana"};
    String target; //? filed

    boolean isFound = false;

    void search() {
        System.out.println("Enter fruit name , so engine can saerch");

        target = input.nextLine();
        for (int i = 0; i < fruits.length; i++) {

            if (fruits[i].equals(target.toLowerCase())) {

                System.out.println("your favorit fruits ia availabele at box " + fruits[i]);
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println("no favorite fruit found");

    }

}
