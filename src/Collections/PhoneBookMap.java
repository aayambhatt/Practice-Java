package Collections;

import java.util.HashMap;
import java.util.Scanner;

class Creation {
    private final HashMap<String, String> phoneBook = new HashMap<>();
    private final Scanner input;

    public Creation(Scanner input) {
        this.input = input; // reuse same scanner from main
    }

    public void addContact() {
        System.out.print("Enter Name: ");
        String name = input.next();
        name = name.toLowerCase();
        System.out.print("Enter Phone Number: ");
        String num = input.next();

        phoneBook.put(name, num);
        System.out.println("Contact Saved");
    }

    public void viewContact() {
        System.out.print("Enter Name to Search: ");
        String name = input.next();
        name = name.toLowerCase();

        if (phoneBook.containsKey(name)) {
            System.out.println(name + "=" + phoneBook.get(name));
        } else {
            System.out.println("Contact not found");
        }
    }
}

public class PhoneBookMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Creation phoneBookApp = new Creation(input);

        while (true) {
            System.out.println("\n--- Phone Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> phoneBookApp.addContact();
                case 2 -> phoneBookApp.viewContact();
                case 3 -> {
                    System.out.println("Exiting Phone Book, Goodbye!");
                    input.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
