package dataStructures;

public class Node<Type> {
    Type data;
    Node prev;
    Node next;

    public Node(Type data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
