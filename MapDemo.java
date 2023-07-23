package map;

import java.util.*;


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

        map.remove(100);
        System.out.println("After removing: "+ map);

        map.replace(200,"White"); // through key we are replacing value
        System.out.println("after replacing with white"+map);

        map.replace(101,"Red","Blackpink");
        System.out.println("Check:"+map);

        Set<Integer> keys = map.keySet(); // used set because set cannot have repeating element
        System.out.println("Set view of keys: "+keys);

        Collection<String> values = map.values(); // collection does not have to be unique
        System.out.println("Collection view of values"+values);

        boolean entryKey = map.containsKey(200);
        System.out.println(entryKey);

        boolean entryValue = map.containsValue("Goldens");
        System.out.println(entryValue);
    }


}
