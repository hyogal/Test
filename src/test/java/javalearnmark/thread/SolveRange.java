package javalearnmark.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanan on 16/4/3.
 */
public class SolveRange {
    /**
     * @param args
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> s = new ArrayList<>();
        List<Integer> rs = new ArrayList<>();
        for (int i = 1; i <= 9; i++){
            s.add(i);
        }
        pl(s, rs);
        long end = System.currentTimeMillis();
        System.out.println("总用时" + (end - start)/1000 + "秒");
    }

    public static void pl(List<Integer> s, List<Integer> rs) {
        if (s.size() == 1) {
            rs.add(s.get(0));
            System.out.println(rs.toString());
            rs.remove(rs.size() - 1);
        } else {
            for (int i = 0; i < s.size(); i++) {
                rs.add(s.get(i));
                List<Integer> tmp = new ArrayList<>();
                for (Integer a : s){
                    tmp.add(a);
                }
                tmp.remove(i);
                pl(tmp, rs);
                rs.remove(rs.size() - 1);
            }
        }
    }
}
