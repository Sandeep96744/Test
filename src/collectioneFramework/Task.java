package collectioneFramework;

public class Task {
    String description;
    int duration;
    String status;

    public Task(String description, int duration) {
        this.description = description;
        this.duration = duration;
        this.status = "pending";
    }

    public String toString() {
        return "Task: " +
                "Description= " + description +
                ", Duration= " + duration + "minutes" +
                ", Status: " + status;
    }
}
