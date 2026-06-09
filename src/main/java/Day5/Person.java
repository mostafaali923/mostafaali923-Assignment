package Day5;

public class Person {

    String name; //Global variable / Field
    int age;
    char gender;
    // constructor => special method in a class that is automatically called when an object is created

    Person() {
        System.out.println("I am the default constructor");
    }


    // Signature

    Person(String name, int age, char gender) {

        //Setter
        this.age = age;
        this.name = name;
        this.gender = gender;

    }

    public void printData() {
        //Getter
        System.out.println("Hello my name is " + name + " I am " + age +
                " years old and my Gender is " + gender);
    }

}

