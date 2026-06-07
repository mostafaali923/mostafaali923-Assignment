package Day4;

import java.util.Scanner;

public class StudentAvrageScore {
    public static void main(String[] args) {
        int numberOfStudent = 3;
        int numberOfCourse = 4;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= numberOfStudent; i++) {
            int total = 0;
            for (int j = 1; j <= numberOfCourse; j++) {

                System.out.println("Enter score for course " + (j) + "for student " + (i));
                double score = sc.nextDouble();

                total += score;

            }
            double average = total / numberOfCourse;
            System.out.println("The average score for student " + (i) + " is: " + average);

        }
    }
}
