package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;

    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long item){
        if(isFull()){
            System.out.println("The Stack is already full");
        }else{
            top++;
            stackArray[top] = item;
        }

    }

    public long pop(){
        if(isEmpty()){
            System.out.println("The Stack is empty");
            return top;
        }else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }

    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
