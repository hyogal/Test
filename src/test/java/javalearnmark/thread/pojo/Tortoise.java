package javalearnmark.thread.pojo;

/**
 * Created by yanan on 15/9/12.
 */
public class Tortoise implements Runnable {
    private int totalStep;
    private int step;

    public Tortoise(int totalStep){
        this.totalStep = totalStep;
    }

    public void run() {
        try {
            while (step < totalStep){
                step++;
                System.out.println("乌龟跑了" + step + "步");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }

    public int getStep() {
        return step;
    }

    public static void main(String[] args){
        Tortoise tortoise = new Tortoise(10);
        Hare hare = new Hare(10);
        Thread tortoiseThread = new Thread(tortoise);
        Thread hareThread = new Thread(hare);

        tortoiseThread.start();
        hareThread.start();

        try {
            //这里的问题：sleep时间少于10S有可能导致程序无法结束，不造为何
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true){
            if(tortoise.getStep() == 10){
                System.out.println("乌龟获胜");
                break;
            }
            if(hare.getStep() == 10){
                System.out.println("兔子获胜");
                break;
            }
        }
    }
}
