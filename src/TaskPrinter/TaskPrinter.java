package TaskPrinter;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskPrinter {

    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Study Java"));
        tasks.add(new Task("Study SQL"));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter new task: ");
        String newTask = input.nextLine();

        tasks.add(new Task(newTask));
        System.out.println("New Task Added");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        System.out.print("Enter the number of the task to mark done (or 0 to skip): ");
        int choice = input.nextInt();
        input.nextLine(); // Clear the input buffer (always after nextInt!)

        if (choice > 0 && choice <= tasks.size()) {
            tasks.get(choice - 1).markDone();
            System.out.println("Task marked as done!");
        } else if (choice != 0) {
            System.out.println("Invalid choice.");
        }

        System.out.println("Updated task list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }


    }
}
