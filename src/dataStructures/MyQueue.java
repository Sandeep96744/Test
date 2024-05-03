package dataStructures;

public class MyQueue<Type> {
    private final int maxSize;
    private Type[] queueArray;
    private int front;
    private int rear;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = (Type[]) new Object[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean insert(Type data) {
        if(isFull()) {
            throw new RuntimeException("Queue is Already Full.");
        }
        rear++;
        queueArray[rear] = data;
        if(front == -1)
            front++;
        return true;
    }

    public Type delete() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Already Empty.");
        }

        return queueArray[front++];
    }

    public Type peek() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty.");
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return front == rear + 1;
    }

    public boolean isFull() {
        return rear == (maxSize-1);
    }


}
