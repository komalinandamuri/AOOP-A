import java.util.ArrayList;
import java.util.List;

public class TodoListApplication {
    private List<String> tasks;

    public TodoListApplication() {
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
        TodoListApplication todoList = new TodoListApplication();
        todoList.addTask("Prepare presentation");
        todoList.addTask("Call the plumber");
        todoList.displayTasks();

        todoList.updateTask(0, "Prepare presentation slides");
        todoList.removeTask(1);
        todoList.displayTasks();
    }
}
