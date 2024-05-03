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
            node.next = first;
            first = node;
        }
    }

    public Type deleteLast() {
        Type data = (Type) last.data;
        if(first == last)  {
            first = last = null;
            return data;
        }

        Node curr = first;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        last = curr;
        curr.next = null;

        return data;
    }

    public Type deleteFirst() {
        if(first.next == null) {
            last = null;
        }
        Type data = (Type) first.data;
        first = first.next;
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
