package javalearnmark.thread.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanan on 15/10/18.
 */
public class Gesture {
    public static Map<Integer, String> gestureMap = new HashMap<Integer, String>(){{
       put(1,"剪刀");
       put(2,"石头");
       put(3,"布");
    }};
}
