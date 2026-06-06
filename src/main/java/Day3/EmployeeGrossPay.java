package Day3;

import java.util.Scanner;

public class EmployeeGrossPay {
    static void main(String[] args) {

        int hourRate = 15;
        int weeklyWorkingHours = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weekly working hours: ");

        double empWorkingHours = sc.nextDouble();

        while(empWorkingHours > weeklyWorkingHours || empWorkingHours <= 0)
        {
            System.out.println("Invalid entry. Please enter between 1h to 40h");

            System.out.println("Enter your weekly working hours: ");
             empWorkingHours = sc.nextDouble();
           // break; bug45
        }

        double salary = empWorkingHours * hourRate;
        System.out.println("Your weekly gross salary is " + salary + "$");
    }
}