package udemy.lecture8.part14;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Alpha Bank");
        bank.addNewBranch("Borrows");
        bank.addNewCustomerToBranch("Borrows", "Valera", 228.0);
        bank.addNewCustomerToBranch("Borrows", "Markus", 228.0);
        bank.addNewTransaction("Valera", 322.0);
        bank.addNewTransaction("Markus", 1488);
        bank.showBranchCustomerList("Borrows");
    }
}
