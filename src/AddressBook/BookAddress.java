package AddressBook;

import java.util.Scanner;

public class BookAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your phone number: ");
        long phoneNo = input.nextLong();

        System.out.println("Your name: " + name + ", " + "Your phone no: " + phoneNo);

    }
}
