package udemy.lecture11.scopeAndVisibility.part11;

public class SomeClass {
    private static int classCouner = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCouner++;
        instanceNumber = classCouner;
        System.out.println(name + " created, instance number " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
