package udemy.lecture11.scopeAndVisibility.part11;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Marques";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd static initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod() called");
    }
}
