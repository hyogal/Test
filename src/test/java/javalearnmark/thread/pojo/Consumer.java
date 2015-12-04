package javalearnmark.thread.pojo;

/**
 * Created by yanan on 15/9/15.
 */
public class Consumer implements Runnable {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("消费者开始消耗整数...");
        for(int i = 1; i<=10; i++){
            try {
                Thread.sleep((int)(Math.random() * 3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int product = clerk.getProduct();
        }
    }
}
