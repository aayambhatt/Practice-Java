package TextAnalyser;

import java.util.Scanner;

class TextAnalyze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.println("Enter text (type 'stop' to finish):");

        while (true) {
            String line = input.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            sb.append(line).append(" "); // keep appending with space
        }

        // Output stored text
        System.out.println("\n--- Results ---");
        System.out.println("Stored text: " + sb);

        // Count characters
        System.out.println("Character count: " + sb.length());

        // Count words
        String[] words = sb.toString().trim().split("\\s+");
        System.out.println("Word count: " + words.length);

        // Reverse text
        System.out.println("Reversed: " + sb.reverse());
    }
}
