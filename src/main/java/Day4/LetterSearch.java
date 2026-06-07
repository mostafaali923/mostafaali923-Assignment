package Day4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you full name: ");
        String fullName = input.nextLine();

        boolean letterFound = false;

        for (int i = 0; i < fullName.length(); i++) {
            char currentLetter = fullName.charAt(i);
            if ( currentLetter == 'A' || currentLetter == 'a' ) {
                letterFound = true;
                break;
            }
        }
        if (letterFound) // take last valu of letterFound

            System.out.println("This name contains the letter A");
        else
            System.out.println("This name does not contain the letter A");


    }
}
