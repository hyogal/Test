package javalearnmark.thread;

import javalearnmark.thread.pojo.Hare;
import javalearnmark.thread.pojo.Tortoise;
import org.junit.Test;

/**
 * Created by yanan on 15/9/12.
 */
public class Demo {
    @Test
    public void tortoiseHareRace() throws Exception{
        int totalStep = 10;
        int tortoiseStep = 0;
        int hareStep = 0;
        boolean[] rate = {true, false};
        while (tortoiseStep < totalStep && hareStep <totalStep){
            Thread.sleep(1000);
            tortoiseStep++;
            System.out.println("乌龟爬了一步");
            if(rate[(int)(Math.random()*10)%2]){
                hareStep+=2;
                System.out.println("兔子跑了两步");
            }
            if(tortoiseStep==10){
                System.out.println("乌龟获胜");
                break;
            }
            if(hareStep==10){
                System.out.println("兔子获胜");
                break;
            }
        }
    }


    public static void main(String[] args){
        Thread tortoiseThread = new Thread(new Tortoise(10));
        Thread hareThread = new Thread(new Hare(10));

        tortoiseThread.start();
        hareThread.start();
    }

}
