package UserInput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your thought: ");
        String text = input.nextLine();

        System.out.print("File name: ");
        String fileName = input.nextLine().trim();

        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text + "\n");
            System.out.println("Your thought was saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
