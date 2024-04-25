package collectioneFramework;
import java.util.*;

public class Main {
    Queue<Task> taskQueue;
    Stack<Task> taskCompleted;
    public Main() {
        taskQueue = new LinkedList<>();
        taskCompleted = new Stack<>();
    }

    void addNewTask(Task task) {
        taskQueue.offer(task);
        System.out.println("Task Added:\n" + task);
    }

    void processTasks() {

        while(!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing Task: " + task.description);
            task.status = "completed";
            System.out.println("Processed!");
            taskCompleted.push(task);
        }
    }

    void displayCompletedTask() {
        if(taskCompleted.isEmpty()) {
            System.out.println("None of the task completed.");
            return;
        }
        System.out.println("Completed Tasks:\n--------------------------");
        while(!taskCompleted.isEmpty()) {
            Task task = taskCompleted.pop();
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to ToDo-Manager\n--------------------------");

        Task t1 = new Task("Hit the Gym", 30);
        Task t2 = new Task("Read books", 60);
        Task t3 = new Task("Pay Bills", 15);

        Main m = new Main();

        m.addNewTask(t1);
        m.addNewTask(t2);
        m.addNewTask(t3);

        m.processTasks();

        m.displayCompletedTask();

    }
}
