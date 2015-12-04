package javalearnmark.thread.other;

/**
 * Created by yanan on 15/10/18.
 */
public class Player {
    //手势1剪刀2石头3布
    private int gesture;
    //游戏者的名字
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGesture() {
        return gesture;
    }

    public void showGesture() {
        this.gesture =  (int) (Math.random() * 3 + 1);
    }
}
