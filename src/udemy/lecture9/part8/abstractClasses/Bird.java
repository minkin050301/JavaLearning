package udemy.lecture9.part8.abstractClasses;

public abstract class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out...");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
