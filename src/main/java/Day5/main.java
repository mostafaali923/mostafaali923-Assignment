package Day5;

public class main {

    public static void main(String[] args) {

//        Person person = new Person();
//
//        Person p1 = new Person("Ahmed",27 , 'M');
//
//        p1.printData();

//        BankAccount bankAccount = new BankAccount(1000);
//
//
//        bankAccount.getBalance(); //1000
//        bankAccount.deposit(500);
//        bankAccount.getBalance();//1500

//        Student student = new Student();
//
//        student.setName("Ali");
//        student.setGrade(85);
//        student.printData();

//        Dog d = new Dog();
//
//        d.eat();
//        d.bark();

        Car car = new Car();
        car.start(); // inheritied method from  veichal
        car.hunk();  // car own method
        car.print(); //     inherited method from veichal

        Bike bike = new Bike();
        bike.start();
        bike.ringBell();

    }
}
