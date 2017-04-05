package april05;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Bye");
        map.put(5, "Night");
        map.put(2, "Hi");

        System.out.println(map);



    }



}
