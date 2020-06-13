package udemy.lecture9.part8.abstractClasses;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out...");
    }
}
