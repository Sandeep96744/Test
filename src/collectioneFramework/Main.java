package collectioneFramework;
import java.util.*;

public class Main {
    Queue<Task> q;

    public Main() {
        q = new LinkedList<Task>();
    }

    void addNewTask(Task task) {
        q.offer(task);
    }

    Stack<Task> processTasks() {
        Stack<Task> st = new Stack<>();

        while(!q.isEmpty()) {
            Task task = q.poll();
            task.status = "completed";
            st.push(task);
        }
        return st;
    }

    void displayCompletedTask(Stack<Task> st) {
        if(st.isEmpty()) {
            System.out.println("None of the task completed");
            return;
        }
        System.out.println("Completed Task:\n--------------------------");
        while(!st.isEmpty()) {
            Task task = st.pop();
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        Task t1 = new Task("Hit the Gym", 30);
        Task t2 = new Task("Read books", 60);
        Task t3 = new Task("Pay Bills", 15);

        Main m = new Main();

        m.addNewTask(t1);
        m.addNewTask(t2);
        m.addNewTask(t3);

        Stack<Task> st = m.processTasks();

        m.displayCompletedTask(st);

    }
}
