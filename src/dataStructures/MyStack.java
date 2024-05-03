package dataStructures;

public class MyStack<Type> {
    private final int maxSize;
    private Type[] stackArray;
    private int top;

    public MyStack(int maxSize){
        this.maxSize=maxSize;
        stackArray = (Type[]) new Object[maxSize];
        top = -1;
    }

    public Type push(Type data){
        if(isFull()){
            throw new RuntimeException("Stack is already full");
        }
        top++;
        stackArray[top]=data;
        return data;
    }

    public Type pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is already empty");
        }
        Type data = stackArray[top];
        top--;
        return data;
    }

    public Type peek() {
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty!");
        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(maxSize-1);
    }
}
