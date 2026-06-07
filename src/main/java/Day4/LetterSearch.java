package Day4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you full name : ");
        String fullName = sc.nextLine();


        char letter = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("The letter '" + letter + "' appears " + count + " times in the name '" + fullName + "'.");


    }
}
