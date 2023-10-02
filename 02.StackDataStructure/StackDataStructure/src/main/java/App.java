import ds.stack.Stack;

public class App {

    public static void main(String[] args) {
        Stack myStack = new Stack(10);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);

        while(!myStack.isEmpty()){
            long popItem = myStack.pop();
            System.out.println(popItem);
        }
    }


}
