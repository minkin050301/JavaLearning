package udemy.lecture8.part18;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Markus", 14.88);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(13.37);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);
        System.out.println(Arrays.toString(integerArrayList.toArray()));

        integerArrayList.add(1, 2);
        System.out.println(Arrays.toString(integerArrayList.toArray()));
    }
}
