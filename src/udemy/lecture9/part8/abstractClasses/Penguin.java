package udemy.lecture9.part8.abstractClasses;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at flying, can I go for a swim insted?");
    }
}
