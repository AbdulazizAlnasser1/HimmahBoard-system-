import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        storeTask(task);
    }

    private void storeTask(Task task) {
        tasks.add(task);
        System.out.println("Task stored successfully.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println("ID: " + task.getId());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Status: " + task.getStatus());
                System.out.println("----------------------");
            }
        }
    }

    public static class Main {

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
}
