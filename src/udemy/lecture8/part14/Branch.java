package udemy.lecture8.part14;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addNewCustomer(Customer customer) {
        customers.add(customer);
    }

    public void setInitialTransactionAmount(double initialTransactionAmount) {
        for (Customer customer : customers) {
            customer.addInitialTransactionAmount(initialTransactionAmount);
        }
    }

    public void addAdditionalTransaction(double transaction) {
        for (Customer customer : customers) {
            customer.addAdditionalTransaction(transaction);
        }
    }

    public void showCustomerList() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". " + customers.get(i).getName() + ", transactions: " +
                    customers.get(i).getTransactions());
        }
    }

    public int findCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customers.indexOf(customer);
            }
        }
        return -1;
    }
}
