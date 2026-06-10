package Day5;

public class Dog extends Animal {

    public void bark() {
        System.out.println("This animal barks");
    }

    @Override // this tells java , we will overidde a method from the parent class

    public void eat() {
        System.out.println("This dog eats bones.");
    }

    @Override
    public void sound() {
        System.out.println("This dog barks");
    }
}
