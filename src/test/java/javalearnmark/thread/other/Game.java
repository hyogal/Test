package javalearnmark.thread.other;

import java.util.Scanner;

/**
 * Created by yanan on 15/10/18.
 */
public class Game {
    public static void main(String[] args) {
        System.out.println("正在进行游戏初始化......");
        Player player1;
        Player player2;
        try {
            player1 = new Player("电脑1");
            player2 = new Player("哈哈我来了");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("很遗憾，游戏初始化失败！");
            return;
        }

        System.out.println("初始化成功，游戏已经开始！");
        System.out.println("请按G掷筛子，退出请按N");
        Scanner scanner = new Scanner(System.in);
        String command;
        while (scanner.hasNext()) {
            command = scanner.next();
            if ("N".equals(command)) {
                return;
            }
            if ("G".equals(command)) {
                player1.showGesture();
                player2.showGesture();
                int gesture1 = player1.getGesture();
                int gesture2 = player2.getGesture();
                System.out.println(player1.getName() + ":" + Gesture.gestureMap.get(gesture1));
                System.out.println(player2.getName() + ":" + Gesture.gestureMap.get(gesture2));
                if (gesture1 == gesture2) {
                    System.out.println("和局");
                    continue;
                }
                if(gesture1 == 1 && gesture2 == 3){
                    System.out.println(player1.getName() + "赢了");
                    continue;
                }
                if(gesture1 == 3 && gesture2 == 1){
                    System.out.println(player2.getName() + "赢了");
                    continue;
                }
                if (gesture1 > gesture2){
                    System.out.println(player1.getName() + "赢了");
                }
                if (gesture2 > gesture1){
                    System.out.println(player2.getName() + "赢了");
                }
            }
        }
    }

}
