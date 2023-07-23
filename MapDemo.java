package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? ->"+ isEmpty);

        map.put(101,"Red");
        map.put(102,"Green");
        map.put(106,"Yellow");
        map.put(103,"Pink");
        map.put(200,"Blue");
        map.put(100," ");

        int size = map.size();
        System.out.println("Size of map is "+ size);

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(112,"Brown");
        map2.put(122,"Silver");
        map2.put(142,"Golden");

        map.putAll(map2);
        System.out.println(map);

        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());

        }
    }


}
