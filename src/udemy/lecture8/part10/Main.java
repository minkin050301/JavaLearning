package udemy.lecture8.part10;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add new contact.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addContact(name, phoneNumber);
    }

    public static void updateContact() {
        System.out.println("Enter the name of contact to modify: ");
        String oldName = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        mobilePhone.updateContact(oldName, newName, newPhoneNumber);
    }

    public static void removeContact() {
        System.out.println("Enter the name of contact to remove: ");
        mobilePhone.removeContact(scanner.nextLine());
    }
    public static void searchForContact() {
        System.out.println("Enter the name of contact to search for: ");
        mobilePhone.searchForContact(scanner.nextLine());
    }
}
