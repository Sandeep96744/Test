package dataStructures;

public class QueueDemo {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>(2);

        queue.insert("Hello");
        queue.insert("java");

        System.out.println(queue.delete());
        System.out.println(queue.delete());
        System.out.println(queue.peek());
    }
}
