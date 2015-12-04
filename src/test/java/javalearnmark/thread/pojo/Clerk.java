package javalearnmark.thread.pojo;

/**
 * Created by yanan on 15/9/15.
 */
public class Clerk {
    private int product = -1;

    public synchronized void setProduct(int product) {
        while (this.product != -1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.product = product;
        System.out.println("生产者设定" + this.product);
        notify();
    }

    public synchronized int getProduct() {
        while (this.product == -1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        int p = this.product;
        System.out.println("消费者取走" + this.product);
        this.product = -1;
        notify();
        return p;
    }
}
