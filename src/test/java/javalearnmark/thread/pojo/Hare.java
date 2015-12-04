package javalearnmark.thread.pojo;

/**
 * Created by yanan on 15/9/12.
 */
public class Hare implements Runnable {
    private int totalStep;
    private int step;

    public Hare(int totalStep){
        this.totalStep = totalStep;
    }

    public int getStep() {
        return step;
    }

    public void run() {
        try {
            boolean[] rate = {true, false};
            while (step < totalStep){
                boolean isSleep = rate[((int)(Math.random()*10))%2];
                if(isSleep){
                    System.out.println("兔子睡着了");
                }else {
                    step+=2;
                    System.out.println("兔子跑了" + step + "步");
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
