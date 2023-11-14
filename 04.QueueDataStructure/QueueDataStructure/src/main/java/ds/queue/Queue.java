package ds.queue;

public class Queue {

    private int maxSize;

    private long[] queueArray;

    private int front;

    private int rear;

    private int numberOfItems;

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.numberOfItems = 0;
    }

    public void insert(long item){

        if(numberOfItems == maxSize){
            System.out.println("Queue has exceeded maximum length");

        }else{
            rear++;
            if(rear > maxSize -1){
                rear = 0;
            }
            queueArray[rear] = item;
            numberOfItems++;
        }


    }

    public void view(){
        System.out.print("[ ");

        for (int i =0;i<queueArray.length && numberOfItems > 0;i++){
            System.out.print(queueArray[i] + " ");
        }

        System.out.println(" ]");
    }

    public long remove(){
        if(numberOfItems < 1){
            System.out.println("No more items for removal");
            return -1;
        }else{
            long temp = queueArray[front];
            queueArray[front] = -1;
            front++;
            numberOfItems--;

            return temp;
        }

    }

    public long peekFront(){
        if(numberOfItems >0){
            return queueArray[front];
        }else{
            return -1;
        }
    }

    public long peekRear(){
        if (numberOfItems > 0){
            return queueArray[rear];
        }else{
            return -1;
        }
    }
}
