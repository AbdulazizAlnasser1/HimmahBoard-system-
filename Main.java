import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        System.out.print("Enter Task ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Task Title: ");
        String title = input.nextLine();

        System.out.print("Enter Task Description: ");
        String description = input.nextLine();

        Task task = new Task(id, title, description);
        manager.addTask(task);

        System.out.println("Task created successfully.\n");

        manager.viewTasks();

        input.close();
    }
}
