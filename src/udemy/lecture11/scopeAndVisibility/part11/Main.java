package udemy.lecture11.scopeAndVisibility.part11;

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//        System.out.println(Math.PI);
//
//        int pw = 228322;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//        password.letMeIn(228);
//        password.letMeIn(228322);
        System.out.println("Main method called");
        SIBTest sibTest = new SIBTest();
        sibTest.someMethod();
        System.out.println("The owner is " + SIBTest.owner);
    }
}
