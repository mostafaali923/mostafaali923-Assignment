package dayTwo;

public class operators {
    static void main(String[] args) {
        // int x = 10;
        // int y = 20;
        //
        // System.out.println(x == y); // false
        // System.out.println(x = y); // x = 20
        // System.out.println("x = " + x); //20
        // System.out.println(x == y); //false, now = true
        //
        // double a = 15.0;
        // int b = 15;
        //
        // System.out.println(a == b); // true
        // System.out.println(a != b); // false

//        int a = 25;
//        int b = 25;
//        System.out.println(a+b);
//        a = a + 5;
//        System.out.println(a);
        int a = 25;
        System.out.println("The value of a = " + a); //25
        int b = 25;
        System.out.println("The sum of a and b = " + a + b); //50
        a = a + 30; //30

        a += 5; // shorthand assignment -> a = a + 5 = 35
        System.out.println(a);

        a = a - 5;
        a -= 5;
        System.out.println("The sub of a - 5 = " + a);

        a = a * 5;
        a *= 5;
        System.out.println("The multi of a * 5 = " + a);

        a = a / 5;
        a /= 5;
        System.out.println("The div of a / 5 = " + a);
        System.out.printf("The div of a is: %d%n ", a);
        int c = 5;
        int d = 5;
        System.out.println(c % b);
        // Relational Operators -> Binary

        int r = 7;
        int s = 5;
        int t = 7;
        int u = 7;

        // System.out.println(r > s); //T
        // System.out.println(r < s); //F
        // System.out.println(r == s); //F
        // System.out.println(r >= s); //T
        // System.out.println(r <= s); //F

        // Logical Operators -> Unary and Binary
        boolean v1 = true;
        boolean v2 = false;

        System.out.println(v1 && v2); // AND => F
        System.out.println(v1 || v2); // OR => T

        System.out.println(a > b && b < c); //true
        System.out.println(a > b && b > c); //false
        System.out.println(a < b || d > a); //false
        System.out.println(a <= b || d>=c);
        int adbi=20;
        int almi=30;
        boolean tamioz =true;

        if(adbi>almi){
            System.out.println("ادخل ادبي ");
        }
        else
        {
            System.out.println("ادخلي علمي");
        }// Increment and Decrement Operators
        int num = 10;
        System.out.println(num++); // post increment => num + 1 (Save in memory)
        System.out.println(num); // 11

        System.out.println(++num); //11 pre increment => increase (num) then display

        int number = 5;
        System.out.println(number++); //5
        System.out.println(number); //6
        System.out.println(++number); //7

        // ternary operator
        int x = 18, y = 10, z;
        c = (x > y) ? x : y; // if a > b is true then c = a false c = b
        System.out.println("The largest value is: " + c);

        if(x > y)
            z = a;
        else
            z = b;
    }
}