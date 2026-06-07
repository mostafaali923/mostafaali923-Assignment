package Day4;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {
        int numberOfStudents = 5;
        int numberOfCourses =4;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents ; i++) {

            int total = 0;

            for (int j = 0; j < numberOfCourses; j++) {
                System.out.println("Enter score for student " + (i+1) + " course " + (j+1) + ": ");
                double score = scanner.nextDouble();
                total += score;
            }
            double average = (double) total / numberOfCourses;
            System.out.println("Average score for student " + (i+1) + ": " + average);
        }
    }
}
