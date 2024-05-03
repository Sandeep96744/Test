package dataStructures;

public class StackDemo {
    public static void main(String[] args) {
        MyStack<String> stk = new MyStack<>(10);
        stk.push("Hello");
        stk.push("Java");

        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
