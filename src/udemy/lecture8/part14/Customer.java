package udemy.lecture8.part14;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    public Customer(String name, double initialTransactionAmount) {
        this(name);
        addInitialTransactionAmount(initialTransactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addInitialTransactionAmount(double initialTransactionAmount) {
        transactions.add(initialTransactionAmount);
    }

    public void addAdditionalTransaction(double transaction) {
        transactions.add(transaction);
    }

    public void showTransactionList() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println((i + 1) + ". " + transactions.get(i));
        }
    }
}
