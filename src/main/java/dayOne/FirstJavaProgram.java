package dayOne;

public class FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("hello big boy!");

        // comment line
        /*
         System.out.println("hello big boy!");
         */
        // variable
        // Declaration
        //DataType variableName = vale; -> Initialization

//        String firstName = "Marwa"; // Store text into variable -> String can contain letters
//        String x = "2 + 2";
//        System.out.println(x);
//
//        String X = "10";
//        String y = "15";
//
//        System.out.println(X + y); // 1015 -> concatenation -. combining two string together

        //Numbers
        // 1- int

        int x = 1000;
        int y = 2000;

//   System.out.println(x + y);
        // System.out.println("sum of x and y is: " , x + y); //problem number 2
//        System.out.println("sum of x and y is: ");
//        System.out.println(x + y);

////       2- Float
//        float f = 12.09f;
//        System.out.println(f);

//        //3- double
//        double d = 55; //55
//        double l = 55.33; //55.33
//        System.out.println(d);
//        System.out.println(l);

        String firstName = "Mostafa";
        String lastName = "Ali";

        String fullName = firstName + " " + lastName;

        int age = 26;

        String dataOfBirth = "22/01/2000";
        String job = "Testing Engineer";
        double income = 25.5;
        double tax = income * 0.15 ; //15% tax
        double netSalary = income - tax;


        //print
        System.out.println("Hello my name is: " + fullName +
                "\nmy age is: " + age +
                "\nmy job is: " + job +
                "\nmy income is: " + netSalary
        );

        System.out.println("--------------------------------");

        System.out.printf("Hello my name is: %s%n"
                        + "my age is: %d%n"
                        + "my job is: %s%n"
                        + "my income is: %f%n",
                fullName, age, job, netSalary
        );
    }

}
