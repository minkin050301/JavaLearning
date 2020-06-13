package udemy.lecture9.part8.abstractClasses;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
    public abstract void breathe();
}
