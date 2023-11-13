import ds.queue.Queue;

public class App {

    public static void main(String[] args) {
        Queue queue = new Queue(5);


        queue.insert(11);
        queue.insert(111);
        queue.insert(112);
        queue.insert(113);
        queue.insert(114);

        queue.view();

        queue.insert(211);
        queue.insert(2111);
        queue.insert(2112);
        queue.insert(2113);
        queue.insert(2114);

        queue.remove();
        queue.insert(999);


        queue.view();
    }


}
