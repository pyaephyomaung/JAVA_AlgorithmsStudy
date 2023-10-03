package ds.stack;

public class Stack {

    private int max_size;
    private char[] contents;

    private int top;

    public Stack(int size){
        this.max_size = size;
        this.contents = new char[max_size];
        top = -1;
    }

    public boolean isFull(){
        return (top == (max_size - 1));
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(char item){
        if (isFull()){
            System.out.println("The stack is already Full!!!");
        }else{
            top++;
            contents[top] = item;
        }
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("The stack is empty!!!");
            return ' ';
        }else{
            int old_top = top;
            top--;
            return contents[old_top];
        }
    }
}
