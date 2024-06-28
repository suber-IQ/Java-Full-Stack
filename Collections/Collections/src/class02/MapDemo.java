package class02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> mapDemo = new HashMap<>();
        mapDemo.put(10,"Raj");
        mapDemo.put(11,"simarn");
        mapDemo.put(12,"Rishab");
        mapDemo.put(13,"Risi");
        System.out.println(mapDemo);
        mapDemo.put(null,"null value");
        mapDemo.put(11,"New Gf");
        System.out.println(mapDemo);

        Iterator<Map.Entry<Integer,String>> entryInteger = mapDemo.entrySet().iterator();

        while(entryInteger.hasNext()){
            System.out.println(entryInteger.next());
        }

        Iterator<Integer> iterator1 = mapDemo.keySet().iterator();
        while(iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.println("key = " + key);
            System.out.println("value = " + mapDemo.get(key));
        }

        mapDemo.keySet().stream().forEach(System.out::println);

    }
}
