package udemy.lecture9.part8.abstractClasses;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
