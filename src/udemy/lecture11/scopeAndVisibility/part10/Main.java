package udemy.lecture11.scopeAndVisibility.part10;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("2nd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        System.out.println(multiply(6));
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
