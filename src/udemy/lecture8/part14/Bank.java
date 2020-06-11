package udemy.lecture8.part14;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addNewBranch(String name) {
        branches.add(new Branch(name));
    }

    public void addNewCustomerToBranch(String branchName, String customerName, double initialTransactionAmount) {
        int foundBranchPosition = findBranch(branchName);

        if (foundBranchPosition == -1) {
            System.out.println("Something went wrong...");
            return;
        }

        Branch branch = branches.get(foundBranchPosition);
        branch.addNewCustomer(new Customer(customerName, initialTransactionAmount));
        //branch.setInitialTransactionAmount(initialTransactionAmount);
//        int customerPosition = branch.findCustomer(customerName);
//        branch.getCustomers().get(customerPosition).addInitialTransactionAmount(initialTransactionAmount);

    }

    public void addNewTransaction(String customerName, double transaction) {
        for (Branch branch : branches) {
            int foundCustomerPosition = branch.findCustomer(customerName);
            if (foundCustomerPosition >= 0) {
                branch.addAdditionalTransaction(transaction);
                System.out.println("Transaction successfully added for the customer's branch.");
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    public void showBranchCustomerList(String branchName) {
        int foundBranchPosition = findBranch(branchName);

        if (foundBranchPosition == -1) {
            System.out.println("Branch not found.");
            return;
        }

        Branch branch = branches.get(foundBranchPosition);
        branch.showCustomerList();
    }

    private int findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branches.indexOf(branch);
            }
        }
        return -1;
    }
}
