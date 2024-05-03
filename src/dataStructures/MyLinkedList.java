package dataStructures;

public class MyLinkedList<Type> {
    private Node first;
    private Node last;

    public MyLinkedList() {
        first = null;
        last = null;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void insertLast(Type data) {
        Node node = new Node(data);

        if(isEmpty()) {
            first = node;
            last = node;
        }
        else {
            node.prev = last;
            last.next = node;
            last = node;
        }
    }

    public void insertFirst(Type data) {
        Node node = new Node(data);

        if(isEmpty()) {
            first = node;
            last = node;
        }
        else {
            first.prev = node;
            node.next = first;
            first = node;
        }
    }

    public Type deleteLast() {
        if(isEmpty()) {
            throw new RuntimeException("LinkedList is already Empty");
        }

        Type data = (Type) last.data;
        if(first == last)  {
            first = last = null;
            return data;
        }

        last = last.prev;
        last.next = null;

        return data;
    }

    public Type deleteFirst() {

        if(isEmpty()) {
            throw new RuntimeException("LinkedList is already Empty");
        }

        if(first.next == null) {
            last = null;
        }
        Type data = (Type) first.data;
        first = first.next;

        if(first != null) {
            first.prev = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList() {
        Node curr = first;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
