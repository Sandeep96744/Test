package dataStructures;


public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertFirst(5);




        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();

        list.displayList();
    }
}
