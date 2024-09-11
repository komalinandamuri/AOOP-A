import java.util.ArrayList;
import java.util.List;

public class TaskManagementSystem {
    private List<String> tasks;

    public TaskManagementSystem() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newDescription);
        } else {
            System.out.println("Task index out of bounds.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Task index out of bounds.");
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        tms.addTask("Complete homework");
        tms.addTask("Buy groceries");
        tms.displayTasks();

        tms.updateTask(1, "Buy groceries and gifts");
        tms.removeTask(0);
        tms.displayTasks();
    }
}
