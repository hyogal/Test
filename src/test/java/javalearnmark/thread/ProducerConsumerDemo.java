package javalearnmark.thread;

import javalearnmark.thread.pojo.Clerk;
import javalearnmark.thread.pojo.Consumer;
import javalearnmark.thread.pojo.Producer;

/**
 * Created by yanan on 15/9/15.
 */
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        new Thread(new Producer(clerk)).start();
        new Thread(new Consumer(clerk)).start();
    }
}
